package club.mrxiao.spring.boot.starter.sf.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置类.
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
@ConfigurationProperties(prefix = "express.sf")
public class SfExpressProperties {

    /**
     * 是否生产环境
     */
    private Boolean pro = false;

    /**
     * 月结卡号
     */
    private String card;

    /**
     * 顾客编码
     */
    private String code;

    /**
     * 校验码
     */
    private String check;

}
