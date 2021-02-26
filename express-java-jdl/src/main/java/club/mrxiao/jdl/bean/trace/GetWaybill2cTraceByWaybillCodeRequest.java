package club.mrxiao.jdl.bean.trace;

import club.mrxiao.jdl.bean.BaseRequest;
import club.mrxiao.jdl.util.json.JdlGsonBuilder;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 查询物流轨迹（给消费者）请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class GetWaybill2cTraceByWaybillCodeRequest extends BaseRequest {

    /**
     * 服务域
     */
    private static final String LOP_DN= "express";

    /**
     * code字段
     */
    private static final String CODE_FIELD = "statusCode";

    /**
     * 成功状态码
     */
    private static final Integer SUCCESS_CODE = 0;

    /**
     * API url
     */
    private static final String METHOD = "/Waybill2CTraceApi/getWaybill2CTraceByWaybillCode";

    /**
     * 查询物流轨迹对象
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private Waybill2cTraceDTO waybill2cTraceDto;

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
        List<Waybill2cTraceDTO> list = new ArrayList<>();
        list.add(this.waybill2cTraceDto);
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
