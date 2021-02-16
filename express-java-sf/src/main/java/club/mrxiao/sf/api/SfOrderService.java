package club.mrxiao.sf.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.bean.order.*;

/**
 * <pre>
 * 顺丰订单api接口
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
public interface SfOrderService {

    /**
     * 创建订单
     * @param request {@link CreateOrderRequest} 下订单请求对象
     * @return {@link CreateOrderResponse} 创建订单响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    CreateOrderResponse createOrder(CreateOrderRequest request) throws ExpressErrorException;

    /**
     * 订单结果查询
     * @param request {@link OrderRespRequest} 订单结果查询请求对象
     * @return {@link OrderRespResponse} 订单结果查询响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    OrderRespResponse orderResp(OrderRespRequest request) throws ExpressErrorException;

    /**
     * 订单确认/取消
     * @param request {@link UpdateOrderRequest} 订单确认/取消请求对象
     * @return {@link UpdateOrderResponse} 订单确认/取消响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    UpdateOrderResponse updateOrder(UpdateOrderRequest request) throws ExpressErrorException;
}
