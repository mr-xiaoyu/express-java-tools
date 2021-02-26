package club.mrxiao.jdl.bean.print;


import lombok.Data;

/**
 * <pre>
 * 获取打印模板列表参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class GetTemplateListReqDTO {

    /**
     * pin授权码/商家授权pin兼容jospin，不需要传
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String pin;

    /**
     * 物流公司编码，京东快递：JD。一期仅支持JD，非必填
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String cpCode;

    /**
     * 模板类型：1，标准模板（各物流公司合作服务商标准运单模板）；2自定义模板（用于商家自己定义的模板不限于运单，可以是其他单据类型模板）；3、ISV自定义模板（ISV合作伙伴自定义模板，与合作伙伴签订软件服务协议的商家以及ISV合作伙伴都可以使用的模板，不限于运单）；4、商家自定义区（运单模板或者其他模板中自定义项内容模板，用于商家自己使用）
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String templateType;

    /**
     * 面单类型：1 快递标准面单 ,2 快递三联面单, 3 快递便携式三联单, 4 快运标准面单, 5 快运三联面单, 6 快递一联单
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String wayTempleteType;

    /**
     * isv资源类型，分为：TEMPLATE（表示模板），PRINT_ITEM（打印项），CUSTOM_AREA（预设自定义区），根据ISV合作伙伴预设的自定义区项类型获取自定义打印项
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String isvResourceType;

    /**
     * 单个模板ID，根据单个模板ID查找
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String templateId;
}
