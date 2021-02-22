package club.mrxiao.jdl.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.bean.print.PullDataRequest;

/**
 * <pre>
 * 京东物流云打印api接口
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-22
 */
public interface JdlPrintService {

    /**
     * 获取打印数据
     * @param request {@link PullDataRequest} 获取打印数据请求对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    void pullData(PullDataRequest request) throws ExpressErrorException;
}
