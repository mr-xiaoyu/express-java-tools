package club.mrxiao.jdl.bean.order;

import lombok.Data;

/**
 * <pre>
 * 取消请求参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class CancelWaybillInterceptReq {

    /**
     * 使用SDK可以不管这个字段；非SDK则属性必须有，值可以为空
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String pin;

    /**
     * 发起取消时间
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private Long cancelTime;

    /**
     * 商家编码
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String vendorCode;

    /**
     * 运单号
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String deliveryId;

    /**
     * 拦截原因
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String interceptReason;

    /**
     * 取消原因编码： 1-用户发起取消； 2-超时未支付
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private Integer cancelReasonCode;

    /**
     * 取消操作人
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String cancelOperator;

    /**
     * 取消来源
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String source;

    /**
     * 取消类型
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String cancelType;
}
