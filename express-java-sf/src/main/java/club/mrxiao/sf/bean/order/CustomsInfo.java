package club.mrxiao.sf.bean.order;

import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 * 报关信息
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class CustomsInfo implements Serializable {

    private static final long serialVersionUID = 2797603655870352272L;
    /**
     * 客户订单货物总声明价值，包含子母件，精确到小数点后3位
     * <pre>
     * 是否必填： 如果是跨境件，则必填
     * </pre>
     */
    private Double declaredValue;

    /**
     * 中国内地默认CNY，否则默认USD	货物声明价值币别，跨境件报关需要填写参照附录币别代码附件
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String declaredValueCurrency;

    /**
     * 报关批次
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String customsBatchs;

    /**
     * 税金付款方式，支持以下值: 1:寄付 2：到付
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String taxPayMethod;

    /**
     * 税金结算账号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String taxSettleAccounts;

    /**
     * 支付工具
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String paymentTool;

    /**
     * 支付号码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String paymentNumber;

    /**
     * 客户订单下单人姓名
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String orderName;

    /**
     * 客户订单下单人证件类型
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String orderCertType;

    /**
     * 客户订单下单人证件号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String orderCertNo;

    /**
     * 税款
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String tax;
}
