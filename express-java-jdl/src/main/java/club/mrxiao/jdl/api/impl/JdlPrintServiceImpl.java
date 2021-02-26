package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlPrintService;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.bean.print.GetTemplateListRequest;
import club.mrxiao.jdl.bean.print.GetTemplateListResponse;
import club.mrxiao.jdl.bean.print.PullDataRequest;
import club.mrxiao.jdl.bean.print.PullDataResponse;
import club.mrxiao.jdl.config.JdlConfig;
import cn.hutool.core.util.IdUtil;
import lombok.AllArgsConstructor;

import java.util.HashMap;
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
}
