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
 * 下单接口请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderInfoRequest extends BaseRequest {

    /**
     * 服务域
     */
    private static final String LOP_DN= "express";

    /**
     * code字段
     */
    private static final String CODE_FIELD = "resultCode";

    /**
     * 成功状态码
     */
    private static final Integer SUCCESS_CODE = 100;

    /**
     * API url
     */
    private static final String METHOD = "/WaybillJosService/receiveOrderInfo";

    /**
     * 运单信息对象
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private WaybillDTO waybillDTO;

    /**
     * 获取返回状态码字段
     * @return 返回状态码字段
     */
    @Override
    public String getCodeField() {
        return CODE_FIELD;
    }

    /**
     * 获取成功返回状态码
     * @return 成功返回状态码
     */
    @Override
    public Integer getSuccessCode() {
        return SUCCESS_CODE;
    }

    /**
     * 获取请求json数据
     * @return 请求json数据
     */
    @Override
    public String getJsonParams() {
        List<WaybillDTO> list = new ArrayList<>();
        list.add(this.waybillDTO);
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
