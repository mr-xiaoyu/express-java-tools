package club.mrxiao.jdl.api;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.bean.print.GetTemplateListRequest;
import club.mrxiao.jdl.bean.print.GetTemplateListResponse;
import club.mrxiao.jdl.bean.print.PullDataRequest;
import club.mrxiao.jdl.bean.print.PullDataResponse;

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
     * @return {@link PullDataResponse} 获取打印数据响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    PullDataResponse pullData(PullDataRequest request) throws ExpressErrorException;

    /**
     * 获取打印模板列表
     * @param request {@link GetTemplateListRequest} 获取打印模板列表请求对象
     * @return {@link GetTemplateListResponse} 获取打印模板列表响应对象
     * @throws ExpressErrorException {@link ExpressErrorException} 异常信息
     */
    GetTemplateListResponse getTemplateList(GetTemplateListRequest request) throws ExpressErrorException;
}
