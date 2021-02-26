package club.mrxiao.jdl.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.bean.order.ReceiveOrderInfoRequest;
import club.mrxiao.jdl.bean.order.ReceiveOrderInfoResponse;

/**
 * <pre>
 * 京东物流订单api接口
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-21
 */
public interface JdlOrderService {

    /**
     * 下单
     * @param request {@link ReceiveOrderInfoRequest} 下单接口请求对象
     * @return {@link ReceiveOrderInfoResponse} 下单接口响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    ReceiveOrderInfoResponse receiveOrder(ReceiveOrderInfoRequest request) throws ExpressErrorException;
}
