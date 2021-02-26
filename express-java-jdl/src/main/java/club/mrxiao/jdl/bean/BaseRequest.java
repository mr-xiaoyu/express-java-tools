package club.mrxiao.jdl.bean;

import club.mrxiao.common.error.ExpressError;
import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.config.JdlConfig;
import club.mrxiao.jdl.util.sign.SignUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static club.mrxiao.jdl.util.sign.SignUtil.encode;

/**
 * <pre>
 * 统一请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
public abstract class BaseRequest {

    /**
     * 获取请求json数据
     * @return 请求json数据
     */
    public abstract String getJsonParams();

    /**
     * 获取服务域
     * @return 服务域
     */
    public abstract String getLopDn();

    /**
     * 获取API url
     * @return API url
     */
    public abstract String getMethod();

    /**
     * 获取返回状态码字段
     * @return 返回状态码字段
     */
    public abstract String getCodeField();

    /**
     * 获取成功返回状态码
     * @return 成功返回状态码
     */
    public abstract Integer getSuccessCode();

    public HttpRequest build(JdlConfig config) throws ExpressErrorException {

        if(config == null){
            throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("请确认物流配置是否正确").build());
        }

        String timestamp =  DateUtil.now();
        Map<String, String> param = new TreeMap<>();
        param.put("method",this.getMethod());
        param.put("timestamp",timestamp);
        param.put("v",config.getV());
        param.put("access_token",config.getToken());
        param.put("app_key",config.getAppKey());
        param.put("param_json",this.getJsonParams());
        String sign = SignUtil.getSign(param,config.getAppSecret());

        String params = "app_key=" + config.getAppKey()
                + "&access_token=" + config.getToken()
                + "&timestamp=" + encode(timestamp)
                + "&v=" + config.getV()
                + "&LOP-DN=" + this.getLopDn()
                + "&sign=" + sign;
        String url = config.getUrl() + this.getMethod() + "?" + params;

        Map<String,String> headers = new HashMap<>(3);
        headers.put("Content-type","application/json;charset=utf-8");
        headers.put("LOP-DN",this.getLopDn());

        return HttpRequest.post(url)
                .body(this.getJsonParams())
                .addHeaders(headers);
    }
}
