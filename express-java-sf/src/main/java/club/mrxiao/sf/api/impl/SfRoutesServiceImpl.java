package club.mrxiao.sf.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.api.SfRoutesService;
import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.bean.BaseRequest;
import club.mrxiao.sf.bean.routes.SearchRoutesRequest;
import club.mrxiao.sf.bean.routes.SearchRoutesResponse;
import lombok.AllArgsConstructor;

/**
 * <pre>
 * 顺丰路由api接口实现
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@AllArgsConstructor
public class SfRoutesServiceImpl implements SfRoutesService {

    private SfService sfService;

    @Override
    public SearchRoutesResponse searchRoutes(SearchRoutesRequest request) throws ExpressErrorException {
        BaseRequest r = new BaseRequest(request.getServiceCode(),request.toJson());
        return SearchRoutesResponse.fromJson(this.sfService.post(r));
    }
}
