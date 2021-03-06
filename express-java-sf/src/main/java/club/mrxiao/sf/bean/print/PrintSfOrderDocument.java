package club.mrxiao.sf.bean.print;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 打印基础业务对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-03-06
 */
@Data
public class PrintSfOrderDocument {

    /**
     * 主运单号
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String masterWaybillNo;

    /**
     * 子运单号
     * <pre>
     * 是否必填： 否,单票运单时不填
     * </pre>
     */
    private String branchWaybillNo;

    /**
     * 签回单号签回单时，masterWayBillNo和branchWaybillNo不填，寄件人，收件人等信息需要自己转换）
     * <pre>
     * 是否必填： 否,单票运单时不填
     * </pre>
     */
    private String backWaybillNo;

    /**
     * 该运单号打印时对应的顺序号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String seq;

    /**
     * 子母件运单总数
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String sum;

    /**
     * 是否打印LOGO
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Boolean isPrintLogo;

    /**
     * 收派员工号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String pickupEmpNo;

    /**
     * 面单上打印的系统来源
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String systemSource;

    /**
     * 打印次数
     * <pre>
     * 是否必填： 是(国际面单可不填)
     * </pre>
     */
    private String printNum;

    /**
     * 打印时间<格式: YYYY-MM-DD hh:mm:ss>
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String printDateTime;

    /**
     * 时效类型（支持选项：t1、t4等，参考图标定义页→时效类型图标）对应RLS的proCode（新模板已弃用，使用agingText）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String agingType;

    /**
     * 时效文本类型，特快等等，对应RLS的proCode（入参customerType=1），不传值时则打印agingType对应的时效图标。
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String agingText;

    /**
     * 目的地（路由信息）
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String destRouteLabel;

    /**
     * 单元区域编码。国际面单可不填
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String destTeamCode;

    /**
     * 寄件人姓名，如需要脱敏，业务系统需自己处理
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String fromName;

    /**
     * 寄件人电话，如需要脱敏，业务系统需自己处理
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String fromPhone;

    /**
     * 寄件人公司名称，如需要脱敏，业务系统需自己处理
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String fromOrgName;

    /**
     * 寄件人地址，如需要脱敏，业务系统需自己处理
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String fromAddress;

    /**
     * 收件人姓名，如需要脱敏，业务系统需自己处理
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String toName;

    /**
     * 收件人电话，如需要脱敏，业务系统需自己处理
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String toPhone;

    /**
     * 收件人公司名称，如需要脱敏，业务系统需自己处理
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String toOrgName;

    /**
     * 收件人地址，如需要脱敏，业务系统需自己处理
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String toAddress;

    /**
     * 是否代收货款（true，false）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Boolean isCod;

    /**
     * 是否回单（true，false）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Boolean isPod;

    /**
     * 付款方式（支持选项：寄付月结、寄付转第三方、寄付现结、到付）
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String payment;

    /**
     * 进港映射码
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String codingMapping;

    /**
     * 二维码信息
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String twoDimensionCode;

    /**
     * 电子产品类型图标（选项：A、B、E），注意RLS接口有A1值，调云打印需传A
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String abFlag;

    /**
     * 出港信息
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String codingMappingOut;

    /**
     * 增值服务
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String incrementService;

    /**
     * 增值服务明细列表,举例如：["保价费用:130元","包装服务:2元"]
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private List<String> incrementServiceList;

    /**
     * 托寄物
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String entrustedArticles;

    /**
     * 订单号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String orderNo;

    /**
     * 件数
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String packageNumber;

    /**
     * 计费重量
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String chargedWeight;

    /**
     * 实际重量
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String actualWeight;

    /**
     * 费用合计
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String costTotal;

    /**
     * 备注
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String remark;

    /**
     * 是否转寄协议客户（支持选项：是、否），国际面单可不填
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String isForwardAgreement;

    /**
     * 产品类型，顺丰特惠等
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String productType;

    /**
     * 产品名称，限时KC24等，对应RLS的 proName
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String productName;

    /**
     * 出港中转场代码
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String sourceTransferCode;

    /**
     * 收货时间<格式: yyyy-MM-dd hh:mm:ss>
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String receiptTime;

    /**
     * 显示费用
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String displayFee;

    /**
     * 图标名称数组
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private List<String> printIcons;

    /**
     * 针对存根区如热敏贴纸上已印刷LOGO及服务电话则不需打印。如未印刷则需打印。true:热敏纸上无印刷需要打印（不需要打印则不填）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Boolean isPrintStubLogo;

    /**
     * 运费
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String transPrice;

    /**
     * 代收货款金额
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String collectMoney;

    /**
     * 运单尺寸（格式：长宽高）
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String size;

    /**
     * 签单返还金额
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String signReturn;

    /**
     * 快件为第三方地区产生的金额
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String thirdAreaPrice;

    /**
     * 快件为易碎件产生的金额
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String fragilePrice;

    /**
     * 月结账号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String monthlyCount;

    /**
     * 优惠券产生的价格
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String discountPrice;

    /**
     * 超长超重产生的价格
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String beyondPrice;

    /**
     * 包装费用
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String packPrice;

    /**
     * 保价费用
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String insurePrice;

    /**
     * 托寄物明细列表
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private List<String> entrustedList;

    /**
     * 报关批次
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String cusBatch;

    /**
     * 贸易条件，用于台湾发票等
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String termsOfTrade;

    /**
     * 是否已实名
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String realName;

    /**
     * 保鲜费用
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String freshPrice;

    /**
     * 安装费用
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String installPrice;

    /**
     * 声报价值
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String declaredValue;

    /**
     * 大件入户费用
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String largeSizedEntryPrice;
}
