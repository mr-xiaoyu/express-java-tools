package club.mrxiao.jdl.bean.order;

import lombok.Data;

import java.util.Date;

/**
 * <pre>
 * 快运业务扩展信息参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class TransExtendedDTO {

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer vehicleType;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer vehicleCount;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer requireTransMode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Date dispatchStartTime;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Date dispatchEndTime;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer specialInstruction;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String warehouseReservationCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Date warehouseReservationTime;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String warehouseRemark;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String enquiryCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer sendToWarehouseId;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String sendToWarehouseCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String sendToWarehouseName;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String warehouseType;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer warehouseOrganizationId;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String warehouseOrganizationCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String purchaseOrderId;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer purchaseOrderSource;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer selfPickupUnitId;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer selfSendUnitId;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String bookUserAccount;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer purchaseQuantity;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer bookQuantity;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String whUniqueCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String returnNo;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer hubType;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String outWarehouseReservationCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String shopCode;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String shopName;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer totalWaybillCount;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String deliveryBatchNo;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String expectedArrivalStartTime;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String expectedArrivalEndTime;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer tranStageType;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer storageHoldType;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Integer requireCollectionGoods;
}
