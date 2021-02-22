package club.mrxiao.sf.config;

import lombok.Data;

/**
 * <pre>
 * 配置
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class SfConfig {

    /**
     * 生产环境地址
     */
    private static final String PRO_URL = "https://sfapi.sf-express.com/std/service";

    /**
     * 沙箱环境地址
     */
    private static final String BOX_URL = "https://sfapi-sbox.sf-express.com/std/service";

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
