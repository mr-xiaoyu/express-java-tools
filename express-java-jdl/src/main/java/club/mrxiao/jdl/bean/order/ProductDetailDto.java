package club.mrxiao.jdl.bean.order;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * <pre>
 * 商品信息参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class ProductDetailDto {

    /**
     * 商品id
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String productId;

    /**
     * 69码、SN码(明细揽收码)
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String snCode;

    /**
     * 商品名称
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String productName;

    /**
     * 商品数量
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer productCount;

    /**
     * 半收原因 1：少货 2：错货 3：破损 4：临保 5：包装破损 6：内物破损
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer halfReason;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String serialNo;

    /**
     * 是否sn管理 0：否 1：是
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer snManage;

    /**
     * 商品主赠关系编号（同一主赠关系中商品，主赠关系编号相同）
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer relationId;

    /**
     * 商品主赠关系：促销单元商品个数
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer suitCount;

    /**
     * 商品主赠关系：商品uuid
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String skuUuid;

    /**
     * 商品主赠关系类型 商品在促销结构中类型 1：不参加促销单品 2：买赠的主品 3：买赠的赠品 4：满赠的主品 5：满赠的赠品 6：加价购赠品 7：延保通 8：延保通赠品
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer skuType;

    /**
     * 影子sku
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String virtualSku;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private BigDecimal guaranteeMoney;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String volumeStorageCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String volumeStorageName;

    /**
     * 业务类型
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer businessType;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String serviceCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer goodsType;

    /**
     * 商品补充信息列表
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private List<ProductAddedServiceDTO> productAddedServices;
}
