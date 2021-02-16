package club.mrxiao.sf.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.bean.routes.SearchRoutesRequest;
import club.mrxiao.sf.bean.routes.SearchRoutesResponse;

/**
 * <pre>
 * 顺丰路由api接口
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
public interface SfRoutesService {

    /**
     * 路由查询
     * @param request {@link SearchRoutesRequest} 路由查询请求对象
     * @return {@link SearchRoutesResponse} 路由查询响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    SearchRoutesResponse searchRoutes(SearchRoutesRequest request) throws ExpressErrorException;
}
