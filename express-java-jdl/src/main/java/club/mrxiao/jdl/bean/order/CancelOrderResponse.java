package club.mrxiao.jdl.bean.order;

import lombok.Data;

/**
 * <pre>
 * 取消下单响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class CancelOrderResponse {

    /**
     * 取消结果状态码: 1 取消成功 2 取消失败 3 取消拦截中
     */
    private Integer stateCode;

    /**
     * 取消结果状态描述
     */
    private String stateMessage;

    /**
     * 申请id
     */
    private Long requestionId;
}
