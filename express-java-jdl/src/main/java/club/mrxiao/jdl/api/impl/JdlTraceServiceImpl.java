package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.api.JdlTraceService;
import club.mrxiao.jdl.bean.trace.GetWaybill2cTraceByWaybillCodeRequest;
import club.mrxiao.jdl.bean.trace.GetWaybill2cTraceByWaybillCodeResponse;
import club.mrxiao.jdl.bean.trace.QueryTraceRequest;
import club.mrxiao.jdl.bean.trace.QueryTraceResponse;
import club.mrxiao.jdl.config.JdlConfig;
import lombok.AllArgsConstructor;

/**
 * <pre>
 * 京东订单轨迹api接口实现
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-21
 */
@AllArgsConstructor
public class JdlTraceServiceImpl implements JdlTraceService {

    /**
     * 服务接口
     */
    private JdlService jdlService;

    @Override
    public QueryTraceResponse queryTrace(QueryTraceRequest request) throws ExpressErrorException {
        JdlConfig config = this.jdlService.getConfig();
        request.getQueryDTO().setJosPin(config.getPin());
        request.getQueryDTO().setCustomerCode(config.getCustomerCode());
        return this.jdlService.execute(request, QueryTraceResponse.class);
    }

    @Override
    public GetWaybill2cTraceByWaybillCodeResponse getWaybill2cTraceByWaybillCode(GetWaybill2cTraceByWaybillCodeRequest request) throws ExpressErrorException {
        JdlConfig config = this.jdlService.getConfig();
        request.getWaybill2cTraceDto().setTradeCode(config.getCustomerCode());
        return this.jdlService.execute(request, GetWaybill2cTraceByWaybillCodeResponse.class);
    }
}
