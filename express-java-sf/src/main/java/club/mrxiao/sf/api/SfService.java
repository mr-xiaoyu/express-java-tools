package club.mrxiao.sf.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.bean.BaseRequest;
import club.mrxiao.sf.config.SfConfig;

/**
 * <pre>
 * 顺丰快递api接口
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
public interface SfService {


    /**
     * 发生post请求
     * @param request {@link BaseRequest}  统一请求对象
     * @return 请求结果
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    String post(BaseRequest request) throws ExpressErrorException;

    /**
     * 设置配置
     * @param config {@link SfConfig} 配置
     */
    void setConfig(SfConfig config);

    /**
     * 获取配置
     * @return {@link SfConfig} 配置
     */
    SfConfig getConfig();

    /**
     * 获取顺丰订单服务
     * @return 顺丰订单服务
     */
    SfOrderService getSfOrderService();

    /**
     * 获取顺丰路由服务
     * @return 顺丰路由服务
     */
    SfRoutesService getSfRoutesService();
}
