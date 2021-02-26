package club.mrxiao.jdl.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.bean.trace.*;
import club.mrxiao.jdl.test.ApiTestModule;
import club.mrxiao.jdl.util.json.JdlGsonBuilder;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice(modules = ApiTestModule.class)
public class JdlTraceServiceImplTest {

    private final Log log = LogFactory.get(this.getClass().getName());

    @Inject
    private JdlService jdlService;

    @Test
    public void queryTrace() throws ExpressErrorException {

        TraceQueryDTO dto = new TraceQueryDTO();
        dto.setWaybillCode("JDVA05659159119");
        QueryTraceRequest request = QueryTraceRequest.builder().queryDTO(dto).build();

        QueryTraceResponse response = this.jdlService.getJdlTraceService().queryTrace(request);
        log.info("【response】:\n {}", JdlGsonBuilder.create().toJson(response));
    }

    @Test
    public void getWaybill2cTraceByWaybillCode() throws ExpressErrorException {

        Waybill2cTraceDTO waybill2cTraceDto = new Waybill2cTraceDTO();
        waybill2cTraceDto.setWaybillCode("JDVA05659159119");

        GetWaybill2cTraceByWaybillCodeRequest request = GetWaybill2cTraceByWaybillCodeRequest.builder()
                .waybill2cTraceDto(waybill2cTraceDto)
                .build();

        GetWaybill2cTraceByWaybillCodeResponse response = this.jdlService.getJdlTraceService().getWaybill2cTraceByWaybillCode(request);
        log.info("【response】:\n {}", JdlGsonBuilder.create().toJson(response));
    }
}
