package club.mrxiao.sf.api.impl;

import club.mrxiao.common.error.ExpressError;
import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.common.error.SfErrorMsgEnum;
import club.mrxiao.sf.api.SfOrderService;
import club.mrxiao.sf.api.SfRoutesService;
import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.bean.BaseRequest;
import club.mrxiao.sf.bean.BaseResponse;
import club.mrxiao.sf.bean.BaseResultData;
import club.mrxiao.sf.config.SfConfig;
import club.mrxiao.sf.util.json.SfGsonBuilder;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpException;
import cn.hutool.http.HttpRequest;

/**
 * <pre>
 * 顺丰快递api接口实现
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
public class SfServiceImpl implements SfService {

    private SfConfig sfConfig;
    private SfOrderService sfOrderService = new SfOrderServiceImpl(this);
    private SfRoutesService sfRoutesService = new SfRoutesServiceImpl(this);

    @Override
    public void setConfig(SfConfig config) {
        this.sfConfig = config;
    }

    @Override
    public SfOrderService getSfOrderService() {
        return this.sfOrderService;
    }

    @Override
    public SfRoutesService getSfRoutesService() {
        return sfRoutesService;
    }

    @Override
    public String post(BaseRequest request) throws ExpressErrorException {
        request.build(this.sfConfig);
        try {
            String result = HttpRequest.post(this.sfConfig.getUrl())
                    .form(request)
                    .header("Content-type","application/x-www-form-urlencoded;charset=UTF-8")
                    .execute().body();
            if(StrUtil.isBlank(result)){
                throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("无响应内容").build());
            }
            BaseResponse response = BaseResponse.fromJson(result);
            if(SfErrorMsgEnum.CODE_A1000.getCode().equals(response.getApiResultCode())){
                BaseResultData data = BaseResultData.fromJson(response.getApiResultData());
                if(data.getSuccess()){
                    return SfGsonBuilder.create().toJson(data.getMsgData());
                }
                throw new ExpressErrorException(ExpressError.builder()
                        .errorCode(data.getErrorCode())
                        .errorMsg(data.getErrorMsg())
                        .json(result)
                        .build());
            }
            throw new ExpressErrorException(ExpressError.builder()
                    .errorCode(response.getApiResultCode())
                    .errorMsg(response.getApiErrorMsg())
                    .json(result)
                    .build());
        }catch (HttpException e){
            throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("接口请求发生错误").build(),e);
        }
    }
}
