package club.mrxiao.sf.bean.order;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 创建订单响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
public class CreateOrderResponse {

    /**
     * 客户订单号
     */
    private String orderId;

    /**
     * 原寄地区域代码，可用于顺丰电子运单标签打印
     */
    private String originCode;

    /**
     * 目的地区域代码，可用于顺丰电子运单标签打印
     */
    private String destCode;

    /**
     * 筛单结果：1：人工确认;2：可收派;3：不可以收派
     */
    private Integer filterResult;

    /**
     * 如果filter_result=3时为必填，不可以收派的原因代码：1：收方超范围;2：派方超范围;3：其它原因
     */
    private String remark;

    /**
     * 二维码URL（用于CX退货操作的URL）
     */
    private String url;

    /**
     * 用于第三方支付运费的URL
     */
    private String paymentLink;

    /**
     * 是否送货上楼 1:是
     */
    private String isUpstairs;

    /**
     * 包含特殊仓库增值服务
     */
    private String isSpecialWarehouseService;

    /**
     * 下单补充的增值服务信息
     */
    private List<Service> serviceList;

    /**
     * 顺丰运单号
     */
    private List<WaybillNoInfo> waybillNoInfoList;

    /**
     * 路由标签
     */
    private List<RouteLabelInfo> routeLabelInfo;

    /**
     * 返回信息扩展属性
     */
    private List<ExtraInfo> returnExtraInfoList;

    public static CreateOrderResponse fromJson(String json) {
        return SfGsonBuilder.create().fromJson(json, CreateOrderResponse.class);
    }
}
