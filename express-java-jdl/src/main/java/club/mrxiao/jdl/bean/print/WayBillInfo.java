package club.mrxiao.jdl.bean.print;

import lombok.Data;

/**
 * <pre>
 * 运单信息列表参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-22
 */
@Data
public class WayBillInfo {

    /**
     * 商城订单号
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String orderNo;

    /**
     * 京东运单号
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String jdWayBillCode;

    /**
     * 运单号
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String wayBillCode;

    /**
     * 是否pop订单，1：pop订单；不填或者0：非pop订单
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer popFlag;
}
