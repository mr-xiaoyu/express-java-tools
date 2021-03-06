package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressError;
import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlPrintService;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.bean.print.*;
import club.mrxiao.jdl.config.JdlConfig;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * 京东物流云打印api接口实现
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-22
 */
@AllArgsConstructor
public class JdlPrintServiceImpl implements JdlPrintService {

    /**
     * 服务接口
     */
    private JdlService jdlService;

    @Override
    public PullDataResponse pullData(PullDataRequest request) throws ExpressErrorException {
        JdlConfig config = this.jdlService.getConfig();
        request.getPullDataReqDTO().setObjectId(IdUtil.simpleUUID());
        request.getPullDataReqDTO().setPin(config.getPin());

        Map<String, String> parameters = new HashMap<>(2);
        parameters.put("ewCustomerCode",config.getCustomerCode());

        if(request.getPullDataReqDTO().getParameters() == null){
            request.getPullDataReqDTO().setParameters(parameters);
        }

        return this.jdlService.execute(request, PullDataResponse.class);
    }

    @Override
    public GetTemplateListResponse getTemplateList(GetTemplateListRequest request) throws ExpressErrorException {
        JdlConfig config = this.jdlService.getConfig();
        request.getGetTemplateListReqDTO().setPin(config.getPin());
        return this.jdlService.execute(request, GetTemplateListResponse.class);
    }

    @Override
    public PrintJdlOrderResponse getPrintData(PullDataRequest request) throws ExpressErrorException {
        JdlConfig config = this.jdlService.getConfig();
        PullDataResponse response = this.pullData(request);

        PrintJdlOrderResponse r = new PrintJdlOrderResponse();
        r.setKey(IdUtil.fastSimpleUUID());
        r.setOrderType("PRINT");

        List<String> ps = new ArrayList<>();
        for (PrePrintDataInfo data : response.getPrePrintDatas()) {
            if(StrUtil.isNotBlank(data.getPerPrintData())){
                ps.add(data.getPerPrintData());
            }
        }
        if(ps.size() == 0){
            throw new ExpressErrorException(ExpressError.builder().errorCode("999").errorMsg("打印数据获取失败").build());
        }
        PrintJdlOrderParameters pa = new PrintJdlOrderParameters();
        pa.setTempUrl(config.getPrintTempUrl());
        pa.setOffsetLeft(config.getPrintOffsetLeft());
        pa.setOffsetTop(config.getPrintOffsetTop());
        pa.setPrintData(ps);
        r.setParameters(pa);

        return r;
    }
}
