package club.mrxiao.sf.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.bean.routes.SearchRoutesRequest;
import club.mrxiao.sf.bean.routes.SearchRoutesResponse;
import club.mrxiao.sf.test.ApiTestModule;
import club.mrxiao.sf.util.json.SfGsonBuilder;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Guice(modules = ApiTestModule.class)
public class SfRoutesServiceImplTest {

    private final Log log = LogFactory.get(this.getClass().getName());

    @Inject
    private SfService sfService;

    @Test
    public void searchRoutes() throws ExpressErrorException {
        List<String> trackingNumber = new ArrayList<>();
        trackingNumber.add("SF6026172790019");
        SearchRoutesRequest request = SearchRoutesRequest.builder()
                .trackingNumber(trackingNumber)
                .build();

        SearchRoutesResponse response = this.sfService.getSfRoutesService().searchRoutes(request);

        log.info("【response】:\n {}", SfGsonBuilder.create().toJson(response));
    }


//    @Test
//    public void jdlTest() throws LopException {
//        DefaultDomainApiClient client = new DefaultDomainApiClient("https://uat-api.jdl.cn");
//        WaybillJosServiceReceiveOrderInfoLopRequest request = new WaybillJosServiceReceiveOrderInfoLopRequest();
//        WaybillDTO waybillDTO = new WaybillDTO();
//        waybillDTO.setJosPin("123");
//        waybillDTO.setAppKey("b4dce1202d3c431ba9f79910eb9fc10f");
//        waybillDTO.setSource("JOS");
//        waybillDTO.setSalePlat("0010001");
//        waybillDTO.setCustomerId(0);
//        waybillDTO.setCustomerCode("010K00001");
//        waybillDTO.setCustomerName("test");
//        waybillDTO.setOrderId("test");
//        waybillDTO.setThrOrderId("test");
//        waybillDTO.setSenderName("张三");
//        waybillDTO.setSenderAddress("北京市大兴区亦庄经济开发区荣京中路19号朝林广场A座21层");
//        waybillDTO.setSenderTel("test");
//        waybillDTO.setSenderMobile("test");
//        waybillDTO.setSenderPostcode("test");
//        waybillDTO.setReceiveName("李思");
//        waybillDTO.setReceiveAddress("北京市大兴区亦庄经济开发区荣京中路19号朝林广场A座21层");
//        waybillDTO.setReceiveTel("test");
//        waybillDTO.setReceiveMobile("test");
//        waybillDTO.setProvinceId(0);
//        waybillDTO.setProvince("test");
//        waybillDTO.setCityId(0);
//        waybillDTO.setCity("test");
//        waybillDTO.setCountyId(0);
//        waybillDTO.setCounty("test");
//        waybillDTO.setTownId(0);
//        waybillDTO.setTown("test");
//        waybillDTO.setPostcode("test");
//        waybillDTO.setPickMethod("test");
//        waybillDTO.setPickAddress("test");
//        waybillDTO.setPickContract("test");
//        waybillDTO.setPickContractTel("test");
//        waybillDTO.setPickContractMobile("test");
//        waybillDTO.setAreaProvId(0);
//        waybillDTO.setAreaCityId(0);
//        waybillDTO.setPackageCount(0);
//        waybillDTO.setWeight(1d);
//        waybillDTO.setVloumLong(0d);
//        waybillDTO.setVloumWidth(0d);
//        waybillDTO.setVloumHeight(0d);
//        waybillDTO.setVloumn(1000d);
//        waybillDTO.setSelfPrintWayBill(0);
//        waybillDTO.setDescription("test");
//        waybillDTO.setGoodsMoney(0d);
//        waybillDTO.setCollectionValue(0);
//        waybillDTO.setCollectionMoney(0d);
//        waybillDTO.setGuaranteeValue(0);
//        waybillDTO.setGuaranteeValueAmount(0d);
//        waybillDTO.setPackageRequired("test");
//        waybillDTO.setSignReturn(0);
//        waybillDTO.setAging(0);
//        waybillDTO.setTransType(0);
//        waybillDTO.setPType("test");
//        waybillDTO.setShopCode("test");
//        waybillDTO.setDeliveryTime("test");
//        waybillDTO.setOrderSendTime("test");
//        waybillDTO.setGoodsType(0);
//        waybillDTO.setOrderType(0);
//        waybillDTO.setOrderStatusId(0);
//        waybillDTO.setOrgId(0);
//        waybillDTO.setSortingCenterId(0);
//        waybillDTO.setSiteType(0);
//        waybillDTO.setSiteId(0);
//        waybillDTO.setSiteName("test");
//        waybillDTO.setRoad("test");
//        waybillDTO.setWarehouseCode("test");
//        waybillDTO.setRemark("test");
//        waybillDTO.setExtendField1("test");
//        waybillDTO.setExtendField2("test");
//        waybillDTO.setExtendField3("test");
//        waybillDTO.setExtendField4(0);
//        waybillDTO.setExtendField5(0);
//        waybillDTO.setIdNumber("test");
//        waybillDTO.setAddedService("test");
//        waybillDTO.setBillType(0);
//        waybillDTO.setStoreType("test");
//        waybillDTO.setCky2(0);
//        waybillDTO.setStoreId(0);
//        waybillDTO.setReturnType(0);
//        waybillDTO.setClientId(0L);
//        waybillDTO.setShipmentStartTime(new java.util.Date());
//        waybillDTO.setShipmentEndTime(new java.util.Date());
//        waybillDTO.setPickupSign("test");
//        waybillDTO.setBussinessModel(0);
//        waybillDTO.setHalfReceive(0);
//        waybillDTO.setLordGiftType(0);
//        waybillDTO.setPickUpStartTime(new java.util.Date());
//        waybillDTO.setPickUpEndTime(new java.util.Date());
//        waybillDTO.setPickUpRemark("test");
//        waybillDTO.setDeliveryPromiseTime(new java.util.Date());
//        waybillDTO.setOrderSubmitTime(new java.util.Date());
//        waybillDTO.setLogisticMode(0);
//        waybillDTO.setSenderCompany("test");
//        waybillDTO.setReceiveCompany("test");
//        waybillDTO.setUserPin("test");
//        waybillDTO.setSenderProvinceId(0);
//        waybillDTO.setSenderProvince("test");
//        waybillDTO.setSenderCityId(0);
//        waybillDTO.setSenderCity("test");
//        waybillDTO.setSenderCountyId(0);
//        waybillDTO.setSenderCounty("test");
//        waybillDTO.setSenderTownId(0);
//        waybillDTO.setSenderTown("test");
//        waybillDTO.setSenderIdNumber("test");
//        waybillDTO.setSenderIdType(0);
//        waybillDTO.setGoods("test");
//        waybillDTO.setGoodsCount(0);
//        waybillDTO.setFreight(0d);
//        waybillDTO.setPromiseTimeType(0);
//        waybillDTO.setWaybillChannel("test");
//        waybillDTO.setUnpackingInspection("test");
//        waybillDTO.setFileUrl("https://cloud.jdl.cn");
//        waybillDTO.setPickUpDetailType(0);
//        waybillDTO.setPickupSiteId(0);
//        request.setWaybillDTO(waybillDTO);
//        LopPlugin oauthPlugin = OAuth2PluginFactory.produceLopPlugin(client.getServerUrl(),"b4dce1202d3c431ba9f79910eb9fc10f", "8c159bae1e004c57bcd991d8580a97ae", "f2059e9969d749d3b43cb4316f7f51d2");
//        request.addLopPlugin(oauthPlugin);
//        WaybillJosServiceReceiveOrderInfoLopResponse response = client.execute(request);
//
//        log.info("【response】:\n {}", SfGsonBuilder.create().toJson(response));
//    }
}
