package club.mrxiao.jdl.bean.print;

import lombok.Data;

/**
 * <pre>
 * 标准模板数据
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class StandardTemplateDTO {

    /**
     * 标准模板id
     */
    private Integer standardTemplateId;

    /**
     * 标准模板名称
     */
    private String standardTemplateName;

    /**
     * 标准模板url
     */
    private String standardTemplateUrl;

    /**
     * 面单类型：1 快递标准面单 ,2 快递三联面
     */
    private String standardWaybillType;
}
