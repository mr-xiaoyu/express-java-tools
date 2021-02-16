package club.mrxiao.sf.bean.order;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 订单确认/取消响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
public class UpdateOrderResponse {

    /**
     * 客户订单号
     */
    private String orderId;

    /**
     * <pre>
     *     备注
     *     1:客户订单号与顺丰运单不匹配
     *     2 :操作成功
     * </pre>
     */
    private Integer resStatus;

    /**
     * 顺丰运单号
     */
    private List<WaybillNoInfo> waybillNoInfoList;

    /**
     * 扩展属性
     */
    private List<ExtraInfo> extraInfoList;


    public static UpdateOrderResponse fromJson(String json) {
        return SfGsonBuilder.create().fromJson(json, UpdateOrderResponse.class);
    }
}
