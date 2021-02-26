package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressError;
import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlOrderService;
import club.mrxiao.jdl.api.JdlPrintService;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.api.JdlTraceService;
import club.mrxiao.jdl.bean.BaseRequest;
import club.mrxiao.jdl.bean.token.TokenResult;
import club.mrxiao.jdl.config.JdlConfig;
import club.mrxiao.jdl.util.json.JdlGsonBuilder;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpException;
import cn.hutool.http.HttpRequest;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.gson.JsonObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static club.mrxiao.jdl.util.sign.SignUtil.encode;
import static club.mrxiao.jdl.util.sign.SignUtil.md5;

/**
 * <pre>
 * 京东快递api接口实现
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-21
 */
public class JdlServiceImpl implements JdlService {

    /**
     * 错误返回
     */
    private static final String ERROR_RESPONSE = "error_response";

    private final Log log = LogFactory.get(this.getClass().getName());

    private JdlConfig config;
    private JdlOrderService jdlOrderService = new JdlOrderServiceImpl(this);
    private JdlTraceService jdlTraceService = new JdlTraceServiceImpl(this);
    private JdlPrintService jdlPrintService = new JdlPrintServiceImpl(this);


    @Override
    public void setConfig(JdlConfig config) throws ExpressErrorException {
        this.refreshToken(config);
    }

    @Override
    public JdlConfig getConfig() {
        return this.config;
    }

    @Override
    public JdlOrderService getJdlOrderService() {
        return this.jdlOrderService;
    }

    @Override
    public JdlTraceService getJdlTraceService() {
        return this.jdlTraceService;
    }

    @Override
    public JdlPrintService getJdlPrintService() {
        return this.jdlPrintService;
    }

    @Override
    public <T> T execute(BaseRequest request,Class<T> clazz) throws ExpressErrorException {
        try {
            String result = request.build(this.config).execute().body();
            if(StrUtil.isBlank(result)){
                throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("无响应内容").build());
            }
            if (result.contains(ERROR_RESPONSE)) {
                throw new ExpressErrorException(ExpressError.builder().json(result).build());
            }
            this.resultSuccess(request,result);
            log.debug("【result】: {} \n",result);
            return JdlGsonBuilder.create().fromJson(result, clazz);
        }catch (HttpException e){
            throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("接口请求发生错误").build(),e);
        }
    }

    private void refreshToken(JdlConfig config) throws ExpressErrorException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String timestamp = dateFormat.format(new Date());

        String sign = md5(config.getAppSecret() + "app_key" + config.getAppKey() + "refresh_token" + config.getRefreshToken() + "timestamp" + timestamp + config.getAppSecret());

        String url = config.getUrl() +
                "/oauth/refresh_token_ext?LOP-DN=oauth.jdwl.com&app_key=" +
                config.getAppKey() +
                "&refresh_token=" + config.getRefreshToken() +
                "&timestamp=" + encode(timestamp) +
                "&sign=" + sign;
        try {
            String result = HttpRequest.post(url).execute().body();
            if(StrUtil.isBlank(result)){
                throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("无响应内容").build());
            }
            if (result.contains(ERROR_RESPONSE)) {
                throw new ExpressErrorException(ExpressError.builder().json(result).build());
            }
            TokenResult r = TokenResult.fromJson(result);
            if(!r.isSuccess()){
                throw new ExpressErrorException(ExpressError.builder()
                        .errorCode(r.getErrCode())
                        .errorMsg(r.getErrMsg())
                        .json(result)
                        .build());
            }
            config.setToken(r.getModel().getAccessToken());
            config.setPin(r.getModel().getSellerId());
            this.config = config;
        }catch (HttpException e){
            throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("接口请求发生错误").build(),e);
        }
    }

    private void resultSuccess(BaseRequest request,String result) throws ExpressErrorException {
        JsonObject obj = JdlGsonBuilder.create().fromJson(result, JsonObject.class);
        if(!obj.has(request.getCodeField())){
            throw new ExpressErrorException(ExpressError.builder()
                    .errorCode("9999")
                    .errorMsg("状态码不存在")
                    .json(result)
                    .build());
        }
        Integer code = obj.get(request.getCodeField()).getAsInt();
        if(!request.getSuccessCode().equals(code)){
            throw new ExpressErrorException(ExpressError.builder()
                    .errorCode(String.valueOf(code))
                    .json(result)
                    .build());
        }
    }
}
