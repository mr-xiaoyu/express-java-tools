package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 用户使用的模板
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class UserTemplate {

    /**
     * 物流公司编码
     */
    private String cpCode;

    /**
     * 该物流公司下用户使用的模板数据列表
     */
    private List<UserTemplateDTO> userStdTemplates;
}
