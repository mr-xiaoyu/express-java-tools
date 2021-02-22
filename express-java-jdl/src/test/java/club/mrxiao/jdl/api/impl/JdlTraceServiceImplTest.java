package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.bean.trace.GetWaybill2cTraceByWaybillCodeRequest;
import club.mrxiao.jdl.bean.trace.QueryTraceRequest;
import club.mrxiao.jdl.bean.trace.TraceQueryDTO;
import club.mrxiao.jdl.bean.trace.Waybill2cTraceDTO;
import club.mrxiao.jdl.test.ApiTestModule;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice(modules = ApiTestModule.class)
public class JdlTraceServiceImplTest {


    @Inject
    private JdlService jdlService;

    @Test
    public void queryTrace() throws ExpressErrorException {

        TraceQueryDTO dto = new TraceQueryDTO();
        dto.setWaybillCode("JDVA055184822081");
        QueryTraceRequest request = QueryTraceRequest.builder().queryDTO(dto).build();

        this.jdlService.getJdlTraceService().queryTrace(request);
    }

    @Test
    public void getWaybill2cTraceByWaybillCode() throws ExpressErrorException {

        Waybill2cTraceDTO waybill2cTraceDto = new Waybill2cTraceDTO();
        waybill2cTraceDto.setWaybillCode("JDVA05518482208");

        GetWaybill2cTraceByWaybillCodeRequest request = GetWaybill2cTraceByWaybillCodeRequest.builder()
                .waybill2cTraceDto(waybill2cTraceDto)
                .build();

        this.jdlService.getJdlTraceService().getWaybill2cTraceByWaybillCode(request);
    }
}
