package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.bean.print.*;
import club.mrxiao.jdl.test.ApiTestModule;
import club.mrxiao.jdl.util.json.JdlGsonBuilder;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Guice(modules = ApiTestModule.class)
public class JdlPrintServiceImplTest {

    private final Log log = LogFactory.get(this.getClass().getName());

    @Inject
    private JdlService jdlService;

    @Test
    public void pullData() throws ExpressErrorException {

        WayBillInfo info = new WayBillInfo();
        info.setJdWayBillCode("JDVA05518482208");

        List<WayBillInfo> wayBillInfos = new ArrayList<>();
        wayBillInfos.add(info);

        PullDataReqDTO dto = new PullDataReqDTO();
        dto.setWayBillInfos(wayBillInfos);
        dto.setCpCode("JD");

        PullDataRequest request = PullDataRequest.builder()
                .pullDataReqDTO(dto)
                .build();

        PullDataResponse response = this.jdlService.getJdlPrintService().pullData(request);
        log.info("【response】:\n {}", JdlGsonBuilder.create().toJson(response));
    }

    @Test
    public void getTemplateList() throws ExpressErrorException {
        GetTemplateListReqDTO dto = new GetTemplateListReqDTO();
        GetTemplateListRequest request = GetTemplateListRequest.builder()
                .getTemplateListReqDTO(dto)
                .build();

        GetTemplateListResponse response = this.jdlService.getJdlPrintService().getTemplateList(request);
        log.info("【response】:\n {}", JdlGsonBuilder.create().toJson(response));
    }
}
