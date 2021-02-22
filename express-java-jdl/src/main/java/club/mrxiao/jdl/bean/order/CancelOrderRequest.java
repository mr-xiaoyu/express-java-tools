package club.mrxiao.jdl.bean.order;


import club.mrxiao.jdl.bean.BaseRequest;
import club.mrxiao.jdl.util.json.JdlGsonBuilder;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 取消下单请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class CancelOrderRequest extends BaseRequest {

    /**
     * 服务域
     */
    private static final String LOP_DN= "express";

    /**
     * API url
     */
    private static final String METHOD = "/OrbLsCancelWaybillInterceptService/cancelOrder";


    /**
     * 取消请求信息对象
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private CancelWaybillInterceptReq cancelRequest;


    /**
     * 获取请求json数据
     * @return 请求json数据
     */
    @Override
    public String getJsonParams() {
        List<CancelWaybillInterceptReq> list = new ArrayList<>();
        list.add(this.cancelRequest);
        return JdlGsonBuilder.create().toJson(list);
    }

    /**
     * 获取服务域
     * @return 服务域
     */
    @Override
    public String getLopDn(){
        return LOP_DN;
    }

    /**
     * 获取API url
     * @return API url
     */
    @Override
    public String getMethod(){
        return METHOD;
    }
}
