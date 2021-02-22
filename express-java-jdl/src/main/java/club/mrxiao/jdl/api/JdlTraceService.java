package club.mrxiao.jdl.api;


import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.bean.trace.GetWaybill2cTraceByWaybillCodeRequest;
import club.mrxiao.jdl.bean.trace.QueryTraceRequest;

/**
 * <pre>
 * 京东物流订单轨迹api接口
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-21
 */
public interface JdlTraceService {

    /**
     * 查询物流轨迹（商家用）
     * @param request {@link QueryTraceRequest} 查询物流轨迹（商家用）请求对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    void queryTrace(QueryTraceRequest request) throws ExpressErrorException;

    /**
     * 查询物流轨迹（商家用）
     * @param request {@link GetWaybill2cTraceByWaybillCodeRequest} 查询物流轨迹（给消费者）请求对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    void getWaybill2cTraceByWaybillCode(GetWaybill2cTraceByWaybillCodeRequest request) throws ExpressErrorException;
}
