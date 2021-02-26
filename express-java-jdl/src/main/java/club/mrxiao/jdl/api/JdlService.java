package club.mrxiao.jdl.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.bean.BaseRequest;
import club.mrxiao.jdl.config.JdlConfig;

/**
 * <pre>
 * 京东物流api接口
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-21
 */
public interface JdlService {

    /**
     * 设置配置
     * @param config {@link JdlConfig} 配置
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    void setConfig(JdlConfig config) throws ExpressErrorException;

    /**
     * 获取配置
     * @return {@link JdlConfig} 配置
     */
    JdlConfig getConfig();

    /**
     * 执行请求
     * @param request {@link BaseRequest} 统一请求对象
     * @param <T> 返回对象
     * @param clazz 返回对象
     * @return 请求结果
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    <T> T execute(BaseRequest request,Class<T> clazz) throws ExpressErrorException;

    /**
     * 获取京东物流订单api接口
     * @return 京东订单api接口
     */
    JdlOrderService getJdlOrderService();

    /**
     * 获取京东物流订单轨迹api接口
     * @return 京东订单轨迹api接口
     */
    JdlTraceService getJdlTraceService();

    /**
     * 获取京东物流云打印api接口
     * @return 京东物流云打印api接口
     */
    JdlPrintService getJdlPrintService();
}
