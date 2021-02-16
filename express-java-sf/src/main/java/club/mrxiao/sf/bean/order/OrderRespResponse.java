package club.mrxiao.sf.bean.order;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 订单结果查询响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
public class OrderRespResponse {

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
     * 下单备注
     */
    private String remark;

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


    public static OrderRespResponse fromJson(String json) {
        return SfGsonBuilder.create().fromJson(json, OrderRespResponse.class);
    }
}
