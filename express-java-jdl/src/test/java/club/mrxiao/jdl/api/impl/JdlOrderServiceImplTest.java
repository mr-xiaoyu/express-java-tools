package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.bean.order.*;
import club.mrxiao.jdl.test.ApiTestModule;
import club.mrxiao.jdl.util.json.JdlGsonBuilder;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice(modules = ApiTestModule.class)
public class JdlOrderServiceImplTest {

    private final Log log = LogFactory.get(this.getClass().getName());

    @Inject
    private JdlService jdlService;

    @Test
    public void receiveOrder() throws ExpressErrorException {

        WaybillDTO dto = new WaybillDTO();
        dto.setSalePlat("0030001");
        dto.setOrderId(IdUtil.simpleUUID());
        dto.setSettleType(1);
        dto.setSenderName("**");
        dto.setSenderMobile("***********");
        dto.setSenderAddress("北京市朝阳区西坝河北里***********");
        dto.setReceiveName("**");
        dto.setReceiveMobile("***********");
        dto.setReceiveAddress("北京市朝阳区西坝河北里中里***********");
        dto.setWeight(0.0);
        dto.setVloumn(0.0);
        dto.setPromiseTimeType(1);
        dto.setPackageCount(1);

        ReceiveOrderInfoRequest request = ReceiveOrderInfoRequest.builder()
                .waybillDTO(dto)
                .build();

        ReceiveOrderInfoResponse response = this.jdlService.getJdlOrderService().receiveOrder(request);
        log.info("【response】:\n {}", JdlGsonBuilder.create().toJson(response));
    }

    @Test
    public void cancelOrder() throws ExpressErrorException {
        CancelWaybillInterceptReq req = new CancelWaybillInterceptReq();
        req.setDeliveryId("JDVA05680711267");
        req.setCancelTime(DateUtil.current(true));
        req.setCancelOperator("xiao");
        req.setCancelReasonCode(1);
        req.setInterceptReason("取消发货");

        CancelOrderRequest request = CancelOrderRequest.builder()
                .cancelRequest(req)
                .build();

        CancelOrderResponse response = this.jdlService.getJdlOrderService().cancelOrder(request);
        log.info("【response】:\n {}", JdlGsonBuilder.create().toJson(response));
    }
}
