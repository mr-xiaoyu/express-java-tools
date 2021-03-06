package club.mrxiao.jdl.config;

import lombok.Data;

/**
 * <pre>
 * 配置
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class JdlConfig {

    /**
     * 生产环境地址
     */
    private static final String PRO_URL = "https://api.jdl.cn";

    /**
     * UAT环境地址
     */
    private static final String BOX_URL = "https://uat-api.jdl.cn";


    /**
     * 是否生产环境
     */
    private Boolean pro = false;

    /**
     * 京东账号
     */
    private String pin;

    /**
     * token 不用配置
     */
    private String token;

    /**
     * refresh_token
     */
    private String refreshToken;

    /**
     * app_key
     */
    private String appKey;

    /**
     * app_secret
     */
    private String appSecret;

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

    /**
     * 版本s
     */
    private String v = "2.0";


    /**
     * 获取api地址
     * @return api地址
     */
    public String getUrl(){
        if(this.pro){
            return PRO_URL;
        }
        return BOX_URL;
    }
}
