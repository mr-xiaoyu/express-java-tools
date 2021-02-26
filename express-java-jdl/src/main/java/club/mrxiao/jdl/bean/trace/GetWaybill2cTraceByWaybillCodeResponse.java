package club.mrxiao.jdl.bean.trace;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 查询物流轨迹（给消费者）响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
public class GetWaybill2cTraceByWaybillCodeResponse {

    /**
     * 成功标识
     */
    private Integer statusCode;

    /**
     * 描述信息
     */
    private String statusMessage;

    /**
     * 轨迹信息
     */
    private List<ExtTraceDTO> data;
}
