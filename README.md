<h1 align="center"><a href="https://github.com/mr-xiaoyu/express-java-tools" target="_blank">京东物流、顺丰物流api java封装</a></h1>

> 封装京东物流、顺丰物流api

**主要实现了以下功能：**

【1】快递下单

【2】取消下单

【3】快递轨迹查询

---------------------------------

### Maven 引用方式

```xml
<dependency>
  <groupId>club.mrxiao</groupId>
  <artifactId>（不同模块参考下文）</artifactId>
  <version>1.0.1</version>
</dependency>
```

- 京东物流：`express-java-jdl`   
- 顺丰物流：`express-java-sf`

---------------------------------

### 调用示例（顺丰）

```java
    import club.mrxiao.common.error.ExpressErrorException;
    import club.mrxiao.sf.api.SfService;
    import club.mrxiao.sf.bean.order.*;
    import club.mrxiao.sf.test.ApiTestModule;
    import club.mrxiao.sf.util.json.SfGsonBuilder;
    import cn.hutool.core.util.IdUtil;
    import cn.hutool.log.Log;
    import cn.hutool.log.LogFactory;
    import com.google.inject.Inject;
    import org.testng.annotations.Guice;
    import org.testng.annotations.Test;
    
    import java.util.ArrayList;
    import java.util.List;
    
    @Guice(modules = ApiTestModule.class)
    public class SfOrderServiceImplTest {
    
        private final Log log = LogFactory.get(this.getClass().getName());
    
        @Inject
        private SfService sfService;
    
        @Test
        public void createOrder() throws ExpressErrorException {
    
            ContactInfo sender = new ContactInfo();
            sender.setContactType(1);
            sender.setContact("**");
            sender.setTel("***********");
            sender.setCountry("CN");
            sender.setProvince("北京市");
            sender.setCity("朝阳区");
            sender.setCounty("朝阳区");
            sender.setAddress("西坝河北里***********");
    
            ContactInfo receiver = new ContactInfo();
            receiver.setContactType(2);
            receiver.setContact("**");
            receiver.setTel("***********");
            receiver.setCountry("CN");
            receiver.setProvince("北京市");
            receiver.setCity("朝阳区");
            receiver.setCounty("朝阳区");
            receiver.setAddress("西坝河中里***********");
    
            List<ContactInfo> contactInfoList = new ArrayList<>();
            contactInfoList.add(sender);
            contactInfoList.add(receiver);
    
    
            CargoDetail cargoDetail = new CargoDetail();
            cargoDetail.setName("文件");
            cargoDetail.setCount(1);
    
            List<CargoDetail> cargoDetails = new ArrayList<>();
            cargoDetails.add(cargoDetail);
    
            CreateOrderRequest request = CreateOrderRequest.builder()
                    .language("zh-CN")
                    .orderId(IdUtil.simpleUUID())
                    .payMethod(2)
                    .remark("测试订单")
                    .contactInfoList(contactInfoList)
                    .cargoDetails(cargoDetails)
                    .build();
    
            CreateOrderResponse response = sfService.getSfOrderService().createOrder(request);
    
            log.info("【response】:\n {}", SfGsonBuilder.create().toJson(response));
    
        }
    
    
        @Test
        public void orderResp() throws ExpressErrorException {
            OrderRespRequest request = OrderRespRequest.builder()
                    .language("zh-CN")
                    .orderId("e48740c6a46d41bebdb21099be5cb946")
                    .build();
            OrderRespResponse response = sfService.getSfOrderService().orderResp(request);
            log.info("【response】:\n {}", SfGsonBuilder.create().toJson(response));
        }
    
        @Test
        public void updateOrder() throws ExpressErrorException {
            UpdateOrderRequest request = UpdateOrderRequest.builder()
                    .orderId("655f2e6ab9234b5ea327cf06e23642e6")
                    .dealType(2)
                    .build();
            UpdateOrderResponse response = sfService.getSfOrderService().updateOrder(request);
            log.info("【response】:\n {}", SfGsonBuilder.create().toJson(response));
        }
    }
```
