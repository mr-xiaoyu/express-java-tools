package club.mrxiao.sf.bean.order;

import lombok.Data;

/**
 * <pre>
 * 托寄物信息
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class CargoDetail {

    /**
     * 货物名称
     * <pre>
     * 是否必填： 如果需要生成电子运单，则为必填
     * </pre>
     */
    private String name;

    /**
     * 货物数量
     * <pre>
     * 是否必填： 跨境件报关需要填写
     * </pre>
     */
    private Integer count;

    /**
     * 货物单位，如：个、台、本
     * <pre>
     * 是否必填： 跨境件报关需要填写
     * </pre>
     */
    private String unit;

    /**
     * 订单货物单位重量，包含子母件，单位千克，精确到小数点后3位
     * <pre>
     * 是否必填： 跨境件报关需要填写
     * </pre>
     */
    private Double weight;

    /**
     * 货物单价，精确到小数点后3位
     * <pre>
     * 是否必填： 跨境件报关需要填写
     * </pre>
     */
    private Double amount;

    /**
     * 货物单价的币别：参照附录币别代码附件
     * <pre>
     * 是否必填： 跨境件报关需要填写
     * </pre>
     */
    private String currency;

    /**
     * 原产地国别
     * <pre>
     * 是否必填： 跨境件报关需要填写
     * </pre>
     */
    private String sourceArea;

    /**
     * 货物产品国检备案编号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String productRecordNo;

    /**
     * 商品海关备案号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String goodPrepardNo;

    /**
     * 商品行邮税号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String taxNo;

    /**
     * 海关编码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String hsCode;

    /**
     * 商品编号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String goodsCode;

    /**
     * 货物品牌
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String brand;

    /**
     * 货物规格型号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String specifications;

    /**
     * 生产厂家
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String manufacturer;

    /**
     * 托寄物毛重
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double shipmentWeight;

    /**
     * 托寄物长
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double length;

    /**
     * 托寄物宽
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double width;

    /**
     * 托寄物高
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double height;

    /**
     * 托寄物体积
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double volume;

    /**
     * 托寄物声明价值
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double cargoDeclaredValue;

    /**
     * 托寄物声明价值币别
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String declaredValueDeclaredCurrency;

    /**
     * 货物id（逆向物流）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String cargoId;

    /**
     * 智能验货标识(1-是,0-否)（逆向物流）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Integer intelligentInspection;

    /**
     * 货物标识码（逆向物流）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String snCode;

    /**
     * 国条码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String stateBarCode;
}
