package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.bean.print.PullDataReqDTO;
import club.mrxiao.jdl.bean.print.PullDataRequest;
import club.mrxiao.jdl.bean.print.WayBillInfo;
import club.mrxiao.jdl.test.ApiTestModule;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Guice(modules = ApiTestModule.class)
public class JdlPrintServiceImplTest {
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

        this.jdlService.getJdlPrintService().pullData(request);

    }
}
