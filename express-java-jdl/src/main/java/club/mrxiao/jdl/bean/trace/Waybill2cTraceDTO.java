package club.mrxiao.jdl.bean.trace;

import lombok.Data;

/**
 * <pre>
 * 查询物流轨迹参数对象（给消费者）
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class Waybill2cTraceDTO {

    /**
     * 配送商家编码，自动添加
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String tradeCode;

    /**
     * 运单号
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String waybillCode;
}
