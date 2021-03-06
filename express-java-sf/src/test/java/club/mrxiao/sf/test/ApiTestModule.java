package club.mrxiao.sf.test;

import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.api.impl.SfServiceImpl;
import club.mrxiao.sf.config.SfConfig;
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

            SfConfig config = new SfConfig();

            if(pro.containsKey("pro")){
                config.setPro(Boolean.valueOf(pro.getProperty("pro")));
            }
            if(pro.containsKey("print_logo")){
                config.setPrintLogo(Boolean.valueOf(pro.getProperty("print_logo")));
            }
            config.setCard(pro.getProperty("card"));
            config.setCheck(pro.getProperty("check"));
            config.setCode(pro.getProperty("code"));
            config.setPrintCode(pro.getProperty("print_code"));
            config.setPrintKey(pro.getProperty("print_key"));
            config.setPrintTemplateCode(pro.getProperty("print_template_code"));

            SfService sfService = new SfServiceImpl();
            sfService.setConfig(config);
            binder.bind(SfService.class).toInstance(sfService);
            binder.bind(SfConfig.class).toInstance(config);
        } catch (IOException e) {
            this.log.error(e.getMessage(), e);
        }
    }
}
