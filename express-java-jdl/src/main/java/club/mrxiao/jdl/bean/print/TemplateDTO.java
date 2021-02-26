package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 所有物流公司和用户标准模板列表
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class TemplateDTO {

    /**
     * 所有物流公司标准模板列表
     */
    private List<StandardTemplate> sDatas;

    /**
     * 用户使用的模板
     */
    private List<UserTemplate> uDatas;

    /**
     * ISV自定义模板以及自定义项内容
     */
    private List<IsvResourceDo> diyDatas;

    /**
     * 商家自定义区内容
     */
    private List<CustomAreaDo> udiyDatas;
}
