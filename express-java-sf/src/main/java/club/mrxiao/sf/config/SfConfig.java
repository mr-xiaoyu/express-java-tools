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
     * 调用地址
     */
    private String url;

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
