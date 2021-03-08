package club.mrxiao.spring.boot.starter.jdl.config;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.jdl.api.JdlService;
import club.mrxiao.jdl.api.impl.JdlServiceImpl;
import club.mrxiao.jdl.config.JdlConfig;
import club.mrxiao.spring.boot.starter.jdl.properties.JdlExpressProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置.
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-03-03
 */
@Configuration
@ConditionalOnClass(JdlService.class)
@EnableConfigurationProperties(JdlExpressProperties.class)
@ConditionalOnProperty(prefix = "xytool.express.jdl", value = "enabled", matchIfMissing = true)
public class JdlExpressAutoConfiguration {

    private final JdlExpressProperties properties;

    public JdlExpressAutoConfiguration(JdlExpressProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(JdlService.class)
    public JdlService jdlService() throws ExpressErrorException {
        JdlConfig config = new JdlConfig();
        config.setPro(properties.getPro());
        config.setAppKey(properties.getAppKey());
        config.setAppSecret(properties.getAppSecret());
        config.setRefreshToken(properties.getRefreshToken());
        config.setCustomerCode(properties.getCustomerCode());
        config.setPrintTempUrl(properties.getPrintTempUrl());
        config.setPrintOffsetLeft(properties.getPrintOffsetLeft());
        config.setPrintOffsetTop(properties.getPrintOffsetTop());
        JdlService service = new JdlServiceImpl();
        service.setConfig(config);
        return service;
    }
}
