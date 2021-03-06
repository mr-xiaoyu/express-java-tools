package club.mrxiao.sf.api.impl;

import club.mrxiao.common.error.ExpressError;
import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.api.SfOrderService;
import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.bean.BaseRequest;
import club.mrxiao.sf.bean.order.*;
import club.mrxiao.sf.bean.print.PrintSfOrderDocument;
import club.mrxiao.sf.bean.print.PrintSfOrderResponse;
import club.mrxiao.sf.config.SfConfig;
import club.mrxiao.sf.util.json.SfGsonBuilder;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public PrintSfOrderResponse getPrintData(OrderRespRequest request) throws ExpressErrorException {
        SfConfig config = this.sfService.getConfig();
        OrderRespResponse response = this.orderResp(request);
        String w = null;
        String b = null;
        List<String> s = new ArrayList<>();
        List<WaybillNoInfo> waybillNoInfoList = response.getWaybillNoInfoList();
        for (WaybillNoInfo info : waybillNoInfoList) {
            if(1 == info.getWaybillType()){
                w = info.getWaybillNo();
            }else if(2 == info.getWaybillType()){
                s.add(info.getWaybillNo());
            }else {
                b = info.getWaybillNo();
            }
        }
        int seq = 1;
        List<RouteLabelInfo> routeLabelInfo = response.getRouteLabelInfo();
        List<PrintSfOrderDocument> documents = new ArrayList<>();
        for (RouteLabelInfo labelInfo : routeLabelInfo) {
            if(!"1000".equals(labelInfo.getCode())){
                throw new ExpressErrorException(ExpressError.builder()
                        .errorCode(labelInfo.getCode())
                        .errorMsg(labelInfo.getMessage())
                        .json(SfGsonBuilder.create().toJson(response))
                        .build());
            }
            RouteLabelData data = labelInfo.getRouteLabelData();
            PrintSfOrderDocument document = new PrintSfOrderDocument();
            if(StrUtil.isNotBlank(b)){
                document.setBackWaybillNo(b);
            }else{
                document.setMasterWaybillNo(w);
                if(s.contains(data.getWaybillNo())){
                    document.setBranchWaybillNo(data.getWaybillNo());
                }
            }
            document.setSeq(String.valueOf(seq));
            document.setSum(String.valueOf(waybillNoInfoList.size()));
            document.setIsPrintLogo(config.getPrintLogo());
            document.setSystemSource("ZJ");
            document.setPrintDateTime(DateUtil.now());
            document.setAgingType(data.getProCode());
            document.setAgingText(data.getProCode());
            document.setDestRouteLabel(data.getDestRouteLabel());
            document.setDestTeamCode(data.getDestTeamCode());
            document.setCodingMapping(data.getCodingMapping());
            document.setTwoDimensionCode(data.getTwoDimensionCode());
            document.setAbFlag(data.getAbFlag());
            document.setCodingMappingOut(data.getCodingMappingOut());
            document.setProductName(data.getProName());
            document.setSourceTransferCode(data.getSourceTransferCode());
            document.setPrintIcons(new ArrayList<String>());
            documents.add(document);
            seq ++;
        }
        PrintSfOrderResponse r = new PrintSfOrderResponse(this.sfService.getConfig());
        r.setDocuments(documents);
        r.setCommond("print");
        return r;
    }
}
