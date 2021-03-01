package club.mrxiao.sf.api.impl;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.bean.routes.SearchRoutesRequest;
import club.mrxiao.sf.bean.routes.SearchRoutesResponse;
import club.mrxiao.sf.test.ApiTestModule;
import club.mrxiao.sf.util.json.SfGsonBuilder;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Guice(modules = ApiTestModule.class)
public class SfRoutesServiceImplTest {

    private final Log log = LogFactory.get(this.getClass().getName());

    @Inject
    private SfService sfService;

    @Test
    public void searchRoutes() throws ExpressErrorException {
        List<String> trackingNumber = new ArrayList<>();
        trackingNumber.add("SF6026172790019");
        SearchRoutesRequest request = SearchRoutesRequest.builder()
                .trackingNumber(trackingNumber)
                .build();

        SearchRoutesResponse response = this.sfService.getSfRoutesService().searchRoutes(request);

        log.info("【response】:\n {}", SfGsonBuilder.create().toJson(response));
    }
}
