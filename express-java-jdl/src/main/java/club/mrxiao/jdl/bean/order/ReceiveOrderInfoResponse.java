package club.mrxiao.jdl.bean.order;

import lombok.Data;

/**
 * <pre>
 * 下单接口响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-24
 */
@Data
public class ReceiveOrderInfoResponse {

    /**
     * 返回码
     */
    private Integer resultCode;

    /**
     * 返回码说明
     */
    private String resultMessage;


    private Boolean needRetry;

    /**
     * 商家订单号（与入参相同）
     */
    private String orderId;

    /**
     * 京东运单号
     */
    private String deliveryId;

    /**
     * 实际时效产品类型（可能与入参不通，以京东实际运力计算结果为准）
     */
    private Integer promiseTimeType;

    /**
     * 错误码（暂未启用）
     */
    private Integer errorCode;

    /**
     * 错误码说明（暂未启用）
     */
    private String errorMessage;

    /**
     * 运输类型 1：陆运 2：航空 不填或者超出范围，默认是1
     */
    private Integer transType;

    private Integer expressOperationMode;

    /**
     * 预分拣结果信息
     */
    private PreSortResult preSortResult;
}
