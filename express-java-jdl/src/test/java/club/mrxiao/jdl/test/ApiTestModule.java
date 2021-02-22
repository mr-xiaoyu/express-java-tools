package club.mrxiao.jdl.test;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.api.impl.JdlServiceImpl;
import club.mrxiao.jdl.config.JdlConfig;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.inject.Binder;
import com.google.inject.Module;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 */
public class ApiTestModule implements Module {

    private final Log log = LogFactory.get(this.getClass().getName());
    private static final String TEST_CONFIG_PROPERTIES = "tset-config.properties";

    @Override
    public void configure(Binder binder) {

        try (InputStream inputStream = ClassLoader.getSystemResourceAsStream(TEST_CONFIG_PROPERTIES)) {
            if (inputStream == null) {
                throw new RuntimeException("测试配置文件【" + TEST_CONFIG_PROPERTIES + "】未找到，请参照test-config-sample.properties文件生成");
            }
            Properties pro = new Properties();
            pro.load(inputStream);
            inputStream.close();

            JdlConfig config = new JdlConfig();

            if(pro.containsKey("pro")){
                config.setPro(Boolean.valueOf(pro.getProperty("pro")));
            }
            config.setAppKey(pro.getProperty("app_key"));
            config.setAppSecret(pro.getProperty("app_secret"));
            config.setCustomerCode(pro.getProperty("customer_code"));
            config.setRefreshToken(pro.getProperty("refresh_token"));
            config.setToken(pro.getProperty("token"));

            JdlService jdlService = new JdlServiceImpl();
            try {
                jdlService.setConfig(config);
            } catch (ExpressErrorException e) {
                this.log.error(e.getMessage(), e);
            }
            binder.bind(JdlService.class).toInstance(jdlService);
            binder.bind(JdlConfig.class).toInstance(config);
        }catch (IOException e) {
            this.log.error(e.getMessage(), e);
        }
    }
}
