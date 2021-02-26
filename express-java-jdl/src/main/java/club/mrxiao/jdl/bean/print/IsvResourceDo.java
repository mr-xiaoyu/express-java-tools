package club.mrxiao.jdl.bean.print;

import lombok.Data;

/**
 * <pre>
 * ISV自定义模板以及自定义项
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
public class IsvResourceDo {

    /**
     * 资源内容（当资源类型为TEMPLATE时，为空）
     */
    private String resourceContent;

    /**
     * 资源id
     */
    private Integer resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源类型 TEMPLATE（表示模板），PRINT_ITEM（打印项），CUSTOM_AREA（预设自定义区）
     */
    private String resourceType;

    /**
     * 资源url（当资源类型为打印项时，为空）
     */
    private String resourceUrl;
}
