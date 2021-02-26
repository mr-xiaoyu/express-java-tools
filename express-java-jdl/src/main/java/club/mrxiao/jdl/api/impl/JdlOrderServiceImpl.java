package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlOrderService;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.bean.order.CancelOrderRequest;
import club.mrxiao.jdl.bean.order.CancelOrderResponse;
import club.mrxiao.jdl.bean.order.ReceiveOrderInfoRequest;
import club.mrxiao.jdl.bean.order.ReceiveOrderInfoResponse;
import club.mrxiao.jdl.config.JdlConfig;
import lombok.AllArgsConstructor;

/**
 * <pre>
 * 京东订单api接口实现
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-21
 */
@AllArgsConstructor
public class JdlOrderServiceImpl implements JdlOrderService {

    /**
     * 服务接口
     */
    private JdlService jdlService;

    @Override
    public ReceiveOrderInfoResponse receiveOrder(ReceiveOrderInfoRequest request) throws ExpressErrorException {
        JdlConfig config = this.jdlService.getConfig();
        request.getWaybillDTO().setJosPin(config.getPin());
        request.getWaybillDTO().setAppKey(config.getAppKey());
        request.getWaybillDTO().setCustomerCode(config.getCustomerCode());
        return this.jdlService.execute(request,ReceiveOrderInfoResponse.class);
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws ExpressErrorException {
        JdlConfig config = this.jdlService.getConfig();
        request.getCancelRequest().setPin(config.getPin());
        request.getCancelRequest().setVendorCode(config.getCustomerCode());
        return this.jdlService.execute(request, CancelOrderResponse.class);
    }
}
