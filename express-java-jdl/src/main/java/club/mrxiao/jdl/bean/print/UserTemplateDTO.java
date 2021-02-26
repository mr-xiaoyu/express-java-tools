package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 该物流公司下用户使用的模板数据列表
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class UserTemplateDTO {

    /**
     * keyList
     */
    private List<String> keys;

    /**
     * 用户使用模板的url
     */
    private String userStdTemplateUrl;

    /**
     * 用户使用模板的id
     */
    private Integer userStdTemplateId;

    /**
     * 用户使用模板名称
     */
    private String userStdTemplateName;
}
