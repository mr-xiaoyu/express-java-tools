package club.mrxiao.sf.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.api.SfOrderService;
import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.bean.BaseRequest;
import club.mrxiao.sf.bean.order.*;
import lombok.AllArgsConstructor;

/**
 * <pre>
 * 顺丰订单api接口实现
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@AllArgsConstructor
public class SfOrderServiceImpl implements SfOrderService {

    private SfService sfService;

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws ExpressErrorException {
        BaseRequest r = new BaseRequest(request.getServiceCode(),request.toJson());
        return CreateOrderResponse.fromJson(this.sfService.post(r));
    }

    @Override
    public OrderRespResponse orderResp(OrderRespRequest request) throws ExpressErrorException {
        BaseRequest r = new BaseRequest(request.getServiceCode(),request.toJson());
        return OrderRespResponse.fromJson(this.sfService.post(r));
    }

    @Override
    public UpdateOrderResponse updateOrder(UpdateOrderRequest request) throws ExpressErrorException {
        BaseRequest r = new BaseRequest(request.getServiceCode(),request.toJson());
        return UpdateOrderResponse.fromJson(this.sfService.post(r));
    }
}
