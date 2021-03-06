package club.mrxiao.spring.boot.starter.sf.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置类.
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
@ConfigurationProperties(prefix = "xytool.express.sf")
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

    /**
     * 云打印授权码（appKey）
     */
    private String printKey;

    /**
     * 云打印系统编码（sysCode）
     */
    private String printCode;

    /**
     * 云打印模板编码
     */
    private String printTemplateCode;

    /**
     * 云打印是否打印LOGO
     */
    private Boolean printLogo = false;

}
