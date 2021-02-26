package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 所有物流公司标准模板
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class StandardTemplate {

    /**
     * 物流公司编码
     */
    private String cpCode;

    /**
     * 该物流公司下标准模板
     */
    private List<StandardTemplateDTO> standardTemplates;
}
