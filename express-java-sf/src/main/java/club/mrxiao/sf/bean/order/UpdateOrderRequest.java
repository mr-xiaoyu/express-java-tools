package club.mrxiao.sf.bean.order;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 订单确认/取消请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-15
 */
@Data
@Builder
public class UpdateOrderRequest {

    /**
     * 接口服务代码
     */
    private static final String SERVICE_CODE = "EXP_RECE_UPDATE_ORDER";

    /**
     * 客户订单号
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String orderId;


    /**
     * 客户订单操作标识: 1:确认;2:取消
     * <pre>
     * 是否必填： 否
     * 默认值： 1
     * </pre>
     */
    private Integer dealType;

    /**
     * 报关批次
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String customsBatchs;

    /**
     * 揽收员工号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String collectEmpCode;

    /**
     * 头程运单号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String inProcessWaybillNo;

    /**
     * 原寄地网点代码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String sourceZoneCode;

    /**
     * 目的地网点代码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String destZoneCode;

    /**
     * 订单货物总重量，包含子母件，单位千克，精确到小数点后3位，如果提供此值，必须>0
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double totalWeight;

    /**
     * 订单货物总体积，单位立方厘米，精确到小数点后3位，会用于计抛（是否计抛具体商务沟通中双方约定）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double totalVolume;

    /**
     * 快件产品类别，支持附录《快件产品类别表》的产品编码值，仅可使用与顺丰销售约定的快件产品
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Integer expressTypeId;

    /**
     * 客户订单货物总长，单位厘米，精确到小数点后3位，包含子母件
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double totalLength;

    /**
     * 客户订单货物总宽，单位厘米，精确到小数点后3位，包含子母件
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double totalWidth;

    /**
     * 客户订单货物总高，单位厘米，精确到小数点后3位，包含子母件
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double totalHeight;

    /**
     * 增值服务信息
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private List<Service> serviceList;

    /**
     * 扩展属性
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private List<ExtraInfo> extraInfoList;

    /**
     * 顺丰运单号
     * <pre>
     * 是否必填： dealtype=1，必填
     * </pre>
     */
    private List<WaybillNoInfo> waybillNoInfoList;

    /**
     * 获取接口服务代码
     * @return 接口服务代码
     */
    public String getServiceCode(){
        return SERVICE_CODE;
    }

    /**
     * 转json
     * @return json数据
     */
    public String toJson() {
        return SfGsonBuilder.create().toJson(this);
    }
}
