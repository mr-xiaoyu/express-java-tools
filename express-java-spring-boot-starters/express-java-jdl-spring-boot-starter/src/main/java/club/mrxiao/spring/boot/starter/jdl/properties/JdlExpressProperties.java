package club.mrxiao.spring.boot.starter.jdl.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置类.
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
@ConfigurationProperties(prefix = "xytool.express.jdl")
public class JdlExpressProperties {

    /**
     * 是否生产环境
     */
    private Boolean pro = false;

    /**
     * app_key
     */
    private String appKey;

    /**
     * app_secret
     */
    private String appSecret;

    /**
     * refresh_token
     */
    private String refreshToken;

    /**
     * 商家编码
     */
    private String customerCode;

    /**
     * 标准模版链接
     */
    private String printTempUrl;

    /**
     * 页面上下偏移量
     */
    private Integer printOffsetTop = 0;

    /**
     * 页面左右偏移量
     */
    private Integer printOffsetLeft = 0;
}
