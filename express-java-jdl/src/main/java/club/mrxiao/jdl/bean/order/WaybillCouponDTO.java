package club.mrxiao.jdl.bean.order;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <pre>
 * 运单优惠信息参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class WaybillCouponDTO {

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String waybillCode;

    /**
     * 优惠券编号
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private String couponId;

    /**
     * 优惠券类型
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private Integer couponType;

    /**
     * 优惠券优惠金额，若为折扣券，传null；其他必传且不为空
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private BigDecimal couponDiscount;

    /**
     * 优惠券类别
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private Integer couponStyle;

    /**
     * 文案描述--限品类文案
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private Integer description;

    /**
     * 折扣率，下单入参时，如果couponType=400，为折扣券，则必传且不为空
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private BigDecimal discountRate;

    /**
     * 折扣券优惠金额上限，下单入参时，如果couponType=400，为折扣券，则必传且不为空
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private BigDecimal discountUpperLimit;

    /**
     * 0-优惠券；1-折扣编码
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private Integer couponMold;

    /**
     * 折扣优惠计算必传code
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String discountMixCode;

}
