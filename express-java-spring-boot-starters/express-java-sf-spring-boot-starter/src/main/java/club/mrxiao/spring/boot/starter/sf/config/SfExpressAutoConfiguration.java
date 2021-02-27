package club.mrxiao.spring.boot.starter.sf.config;

import club.mrxiao.sf.api.SfService;
import club.mrxiao.sf.api.impl.SfServiceImpl;
import club.mrxiao.sf.config.SfConfig;
import club.mrxiao.spring.boot.starter.sf.properties.SfExpressProperties;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置.
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2019-12-26
 */
@AllArgsConstructor
@Configuration
@ConditionalOnClass(SfService.class)
@EnableConfigurationProperties(SfExpressProperties.class)
@ConditionalOnProperty(prefix = "express.jdl", value = "enabled", matchIfMissing = true)
public class SfExpressAutoConfiguration {

    private SfExpressProperties properties;

    @Bean
    @ConditionalOnMissingBean(SfService.class)
    public SfService service(){
        SfConfig config = new SfConfig();
        config.setPro(properties.getPro());
        config.setCard(properties.getCard());
        config.setCode(properties.getCode());
        config.setCheck(properties.getCheck());

        SfService service = new SfServiceImpl();
        service.setConfig(config);
        return service;
    }
}
