package club.mrxiao.jdl.bean.print;

import lombok.Data;

/**
 * <pre>
 * 获取打印模板列表响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class GetTemplateListResponse {

    /**
     * 响应码
     */
    private String code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 所有物流公司和用户标准模板列表
     */
    private TemplateDTO datas;
}
