package club.mrxiao.sf.bean.order;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * 下订单请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
@Builder
public class CreateOrderRequest implements Serializable {

    private static final long serialVersionUID = 2141462736904539515L;

    /**
     * 接口服务代码
     */
    private static final String SERVICE_CODE = "EXP_RECE_CREATE_ORDER";

    /**
     * 响应报文的语言，缺省值为zh-CN，目前支持以下值zh-CN表示中文简体，zh-TW或zh-HK或zh-MO表示中文繁体，en表示英文
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String language;

    /**
     * 客户订单号
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String orderId;


    /**
     * 拖寄物类型描述,如：文件，电子产品，衣服等
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String cargoDesc;

    /**
     * 顺丰月结卡号
     * <pre>
     * 是否必填： 月结支付时传值,现结不需传值
     * </pre>
     */
    private String monthlyCard;

    /**
     * 付款方式，支持以下值：1:寄方付,2:收方付,3:第三方付
     * <pre>
     * 是否必填： 否
     * 默认值： 1
     * </pre>
     */
    private Integer payMethod;

    /**
     * 快件产品类别，支持附录《快件产品类别表》的产品编码值，仅可使用与顺丰销售约定的快件产品
     * <pre>
     * 是否必填： 否
     * 默认值： 1
     * </pre>
     */
    private Integer expressTypeId;

    /**
     * 包裹数，一个包裹对应一个运单号；若包裹数大于1，则返回一个母运单号和N-1个子运单号
     * <pre>
     * 是否必填： 否
     * 默认值： 1
     * </pre>
     */
    private Integer parcelQty;


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
     * 订单货物总体积，单位立方厘米,精确到小数点后3位，会用于计抛(是否计抛具体商务沟通中双方约定)
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double volume;

    /**
     * 订单货物总重量，若为子母件必填，单位千克，精确到小数点后3位，如果提供此值，必须>0 (子母件需>6)
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double totalWeight;

    /**
     * 商品总净重
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Double totalNetWeight;

    /**
     * 要求上门取件开始时间，格式：YYYY-MM-DD HH24:MM:SS，示例：2012-7-30 09:30:00
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Date sendStartTm;

    /**
     * 是否通过手持终端通知顺丰收派员上门收件，支持以下值：1：要求 0：不要求
     * <pre>
     * 是否必填： 否,
     * 默认值： 0
     * </pre>
     */
    private Integer isDocall;

    /**
     * 是否返回签回单（签单返还）的运单号，支持以下值：1：要求 0：不要求
     * <pre>
     * 是否必填： 否,
     * 默认值： 0
     * </pre>
     */
    private Integer isSignBack;

    /**
     * 客户参考编码：如客户原始订单号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String custReferenceNo;

    /**
     * 温度范围类型
     * <pre>
     * 是否必填： 当express_type为12医药温控件时必填，支持以下值：1:冷藏 3：冷冻
     * </pre>
     */
    private Integer temperatureRange;

    /**
     * 订单平台类型（对于平台类客户，如果需要在订单中 区分订单来源，则可使用此字段） 天猫:tmall，拼多多：pinduoduo，京东 : jd 等平台类型编码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String orderSource;

    /**
     * 业务配置代码，业务配置代码指BSP针对客户业务需求配置的一套接口处理逻辑，一个接入编码可对应多个业务配置代码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String 	bizTemplateCode;

    /**
     * 备注
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String 	remark;

    /**
     * 快件自取，支持以下值：1：客户同意快件自取0：客户不同意快件自取
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Integer isOneselfPickup;

    /**
     * 筛单特殊字段用来人工筛单
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Integer filterField;

    /**
     * 是否返回用来退货业务的二维码URL，支持以下值：1：返回二维码 0：不返回二维码
     * <pre>
     * 是否必填： 否
     * 默认值:  0
     * </pre>
     */
    @SerializedName("isReturnQRCode")
    private Integer isReturnQrcode;

    /**
     * 特殊派送类型代码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String specialDeliveryTypeCode;

    /**
     * 特殊派件具体表述
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String specialDeliveryValue;

    /**
     * 寄件实名认证流水号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String realnameNum;

    /**
     * 商户支付订单号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String merchantPayOrderNo;

    /**
     * 是否返回签回单路由标签;1：返回路由标签，0：不返回
     * <pre>
     * 是否必填： 否
     * 默认值:  0
     * </pre>
     */
    private Integer isReturnSignBackRoutelabel;

    /**
     * 是否返回路由标签;1：返回路由标签，0：不返回
     * <pre>
     * 是否必填： 否
     * 默认值:  0
     * </pre>
     */
    private Integer isReturnRoutelabel;

    /**
     * 是否使用国家统一面单号;1：是， 0：否（默认）
     * <pre>
     * 是否必填： 否
     * 默认值:  0
     * </pre>
     */
    private Integer isUnifiedWaybillNo;

    /**
     * 签单返还范本地址
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String podModelAddress;

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
     * 收寄双方信息
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private List<ContactInfo> contactInfoList;

    /**
     * 托寄物信息
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private List<CargoDetail> cargoDetails;

    /**
     * 增值服务信息
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private List<Service> serviceList;

    /**
     * 报关信息
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private CustomsInfo customsInfo;

    /**
     * 顺丰运单号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private List<WaybillNoInfo> waybillNoInfoList;

    /**
     * 扩展属性
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private List<ExtraInfo> extraInfoList;


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
