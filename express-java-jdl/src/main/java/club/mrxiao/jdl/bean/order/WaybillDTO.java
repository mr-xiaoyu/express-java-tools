package club.mrxiao.jdl.bean.order;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * 运单信息参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class WaybillDTO{

    /**
     * 京东pin
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String josPin;

    /**
     * 应用的app_key
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String appKey;

    /**
     * 订单来源，仓配、纯配B2B为ECLP，其他情况商家可自定义，但不能与现有来源重复
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String source;

    /**
     * <pre>
     * 销售平台，
     * 0010001：京东平台
     * 0030001：其他小型销售平台
     * 0010003：苏宁
     * 0090001：POP商家自主售后
     * 0010002：天猫平台
     * 0010004：亚马逊中国
     * 0020001：ChinaSkin（韩国瓷肌）
     * 非SOP商家默认填写：0030001
     * </pre>
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String salePlat;

    /**
     * 商家ID（商家编码在数据库中商家基础信息表中的ID）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer customerId;

    /**
     * 商家编码 青龙业主号（配送编码），是青龙系统对商家的编码
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private String customerCode;

    /**
     * 商家名称
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String customerName;

    /**
     * 付费方式,0:寄付月结,1:到付,2:寄付现结
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer settleType;

    /**
     * 商家订单号，强烈建议商家填写，该字段用于系统防重。如果不填写，系统将使用青龙运单号填充该字段
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String orderId;

    /**
     * 销售平台订单号。例如京东订单号或天猫订单号。如果有多个单号，用英文,间隔。例如：7898675,7898676如果不是平台下单而是某一个商家下单，则不用填写
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String thrOrderId;

    /**
     * 寄件人姓名，说明：不能为生僻字，暂不支持emoji
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private String senderName;

    /**
     * 寄件人地址，说明：不能为生僻字，请填写省市区县详细地址
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private String senderAddress;

    /**
     * 寄件人电话（座机）（与senderMobile必须有一个不为空）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderTel;

    /**
     * 寄件人手机(寄件人电话、手机至少有一个不为空)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderMobile;

    /**
     * 寄件人邮编
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderPostcode;

    /**
     * 收件人名称，说明：不能为生僻字，暂不支持emoji
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private String receiveName;

    /**
     * 收件人详细地址，说明：不能为生僻字，请填写省市区县详细地址
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private String receiveAddress;

    /**
     * 收件人电话（座机）（与receiveMobile必须有一个不为空）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String receiveTel;

    /**
     * 收件人手机号(收件人电话、手机至少有一个不为空)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String receiveMobile;

    /**
     * 收件人省编码
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer provinceId;

    /**
     * 收件人省（可以直接拼入receiveAddress中）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String province;

    /**
     * 收件人市编码
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer cityId;

    /**
     * 收件人市（可以直接拼入receiveAddress中）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String city;

    /**
     * 收件人县编码
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer countyId;

    /**
     * 收件人县可以直接拼入receiveAddress中）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String county;

    /**
     * 收件人镇编码
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer townId;

    /**
     * 收件人镇（可以直接拼入receiveAddress中）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String town;

    /**
     * 收件人邮编
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String postcode;

    /**
     * <pre>
     *     取件方式
     *     0、默认
     *     1、上门揽收
     *     2、自送网点
     *     3、司机现场下单揽收
     *     4、整车上门提货（TC项目使用）。不填写：商家无诉求，此字段无意义
     * </pre>
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String pickMethod;

    /**
     * 取件地址
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String pickAddress;

    /**
     * 取件联系人姓名
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String pickContract;

    /**
     * 取件联系人座机
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String pickContractTel;

    /**
     * 取件联系人手机
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String pickContractMobile;

    /**
     * 接货省ID
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer areaProvId;

    /**
     * 接货市ID
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer areaCityId;

    /**
     * 包裹数(大于0，小于1000)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer packageCount;

    /**
     * 重量(单位：kg，保留小数点后两位)，可以填0
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private Double weight;

    /**
     * 包裹长(单位：cm,保留小数点后两位)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Double vloumLong;

    /**
     * 包裹宽(单位：cm，保留小数点后两位)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Double vloumWidth;

    /**
     * 包裹高(单位：cm，保留小数点后两位)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Double vloumHeight;

    /**
     * 体积(单位：cm3，保留小数点后两位)，可以填0 如果vloumLong、 vloumWidth、 vloumHeight均不是空，此处应填写三者之积
     * <pre>
     *     是否必填：是
     * </pre>
     */
    private Double vloumn;

    /**
     * 是否客户打印运单(是：1，否：0。不填或者超出范围，默认是1)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer selfPrintWayBill;

    /**
     * 寄托物内容
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String description;

    /**
     * 货款 商家声明的寄托物的价格
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Double goodsMoney;

    /**
     * 是否代收货款(是：1，否：0。不填或者超出范围，默认是0)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer collectionValue;

    /**
     * 代收货款金额(保留小数点后两位)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Double collectionMoney;

    /**
     * 是否保价(是：1，否：0。不填或者超出范围，默认是0)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer guaranteeValue;

    /**
     * 保价金额(保留小数点后两位)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Double guaranteeValueAmount;

    /**
     * 包装要求(不需包装：1，简单包装：2，特殊包装：3。不填或者超出范围，默认是1)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String packageRequired;

    /**
     * 签单返还(签单返还类型：0-不返单，1-普通返单，2-校验身份返单，3-电子签返单，4-电子返单+普通返单)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer signReturn;

    /**
     * 时效(普通：1，工作日：2，非工作日：3，晚间：4。O2O一小时达：5。O2O定时达：6。不填或者超出范围，默认是1)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer aging;

    /**
     * 运输类型(陆运：1，航空：2。不填或者超出范围，默认是1)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer transType;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String pType;

    /**
     * 门店编码(只O2O运单需要传，普通运单不需要传)
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String shopCode;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String deliveryTime;

    /**
     * 预约配送时间（格式：yyyy-MM-dd HH:mm:ss。例如：2020-08-18 08:30:00）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String orderSendTime;

    /**
     * 配送业务类型（ 1:普通，2:生鲜常温，5:鲜活，6:控温，7:冷藏，8:冷冻，9:深冷）默认是1；若是生鲜相关产品，则填写枚举2、5、6、7、8、9，否则不填或填1
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer goodsType;

    /**
     * 运单类型。(普通外单：0，O2O外单：1)默认为0 0：普通外单 1：O2O外单 默认：0
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer orderType;

    /**
     * 运单状态ID（仅内部使用）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer orderStatusId;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer orgId;

    /**
     * 分拣中心ID
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer sortingCenterId;

    /**
     * 站点类型
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer siteType;

    /**
     * 站点编码
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer siteId;

    /**
     * 站点名称
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String siteName;

    /**
     * 路区；XXX路XXX小区
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String road;

    /**
     * 发货仓编码
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String warehouseCode;

    /**
     * 运单备注（不超过20个字）,打印面单时备注内容也会显示在快递面单上
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String remark;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String extendField1;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String extendField2;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String extendField3;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer extendField4;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer extendField5;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String idNumber;

    /**
     * 增值服务
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String addedService;

    /**
     * 计费方式 0：普通计费 1：仓配一体价 默认为0
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer billType;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String storeType;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer cky2;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer storeId;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer returnType;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Long clientId;

    /**
     * 商家期望的配送开始时间
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Date shipmentStartTime;

    /**
     * 商家期望的配送结束时间
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Date shipmentEndTime;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String pickupSign;

    /**
     * 电商模式 0：2C订单 1：2B订单
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer bussinessModel;

    /**
     * 包裹半收类型 0： 1： 2： 3
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer halfReceive;

    /**
     * 商品明细
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private List<ProductDetailDto> goodsDtoList;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer lordGiftType;

    /**
     * 主品和赠品关系列表
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private List<LordGiftWaybillRelationDTO> lordGiftRelationList;

    /**
     * 商家期望的揽收开始时间
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Date pickUpStartTime;

    /**
     * 商家期望的揽收结束时间
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Date pickUpEndTime;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String pickUpRemark;

    /**
     * 预计送达时间
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Date deliveryPromiseTime;

    /**
     * 下单时间
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Date orderSubmitTime;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer logisticMode;

    /**
     * 快运业务扩展信息
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private TransExtendedDTO transExtendedDTO;

    /**
     * 寄件人公司，长度：50，说明：不能为生僻字
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderCompany;

    /**
     * 收件人公司，长度：50，说明：不能为生僻字
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String receiveCompany;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String userPin;

    /**
     * 寄件人省的京标四级地址（一级地址）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer senderProvinceId;

    /**
     * 寄件人省的中文名称（可拼入senderAddress中）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderProvince;

    /**
     * 寄件人市的京标四级地址（二级地址）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer senderCityId;

    /**
     * 寄件人市的中文名称（可拼入senderAddress中）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderCity;

    /**
     * 寄件人区、县的京标四级地址（三级地址）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer senderCountyId;

    /**
     * 寄件人区、县的中文名称可拼入senderAddress中）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderCounty;

    /**
     * 寄件人村、镇的京标四级地址（四级地址）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer senderTownId;

    /**
     * 寄件人村、镇的中文名称（可拼入senderAddress中）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderTown;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String senderIdNumber;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer senderIdType;

    /**
     * KA专用，如果填写会覆盖description（兼容终端展示逻辑）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String goods;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer goodsCount;

    /**
     * 预估费用
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Double freight;

    /**
     * 产品类型（1：特惠送 2：特快送 4：城际闪送 7：微小件 8: 生鲜专送 16：生鲜特快 17、生鲜特惠 20:函数达 21：特惠包裹）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer promiseTimeType;

    /**
     * 运单优惠信息
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private List<WaybillCouponDTO> waybillCouponDTOList;

    /**
     * 业务订单来源 京喜：JINGXI
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String waybillChannel;

    /**
     * 开箱验货标识（1：随心验(收费)，2：开商品包装验货，3：开物流包装验货，4：不支持开箱验货）
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String unpackingInspection;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private List<String> boxCodeList;

    /**
     * 文件url，选择函速达时必填
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String fileUrl;

    /**
     * 揽收明细 2：支持缺量
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer pickUpDetailType;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer pickupSiteId;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Map<String, String> extendMessage;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private List<CustomerBoxDTO> customerBoxList;
}
