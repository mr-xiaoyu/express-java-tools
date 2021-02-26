package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 商家自定义区内容
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
public class CustomAreaDo {

    /**
     * 自定义区id
     */
    private Integer customAreaId;

    /**
     * 自定义区url
     */
    private String customAreaUrl;

    /**
     * keysList
     */
    private List<String> keys;

    /**
     * 自定义区名称
     */
    private String customAreaName;

    /**
     * cp编码(物流公司编码)
     */
    private String cpCode;

    /**
     * 用户使用模板的url
     */
    private String standardTemplateUrl;

    /**
     * 用户使用模板的id
     */
    private String standardTemplateId;

    /**
     * 用户使用模板名称
     */
    private String standardTemplateName;

    private List<CustomAreaKeyResult> customAreaKeys;
}
