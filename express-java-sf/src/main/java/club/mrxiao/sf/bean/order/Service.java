package club.mrxiao.sf.bean.order;

import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 * 增值服务信息
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class Service implements Serializable {

    private static final long serialVersionUID = -6126039998309504721L;

    /**
     * 增值服务名，如COD等
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String name;

    /**
     * 增值服务扩展属性，参考增值服务传值说明
     * <pre>
     * 是否必填： 条件
     * </pre>
     */
    private String value;

    /**
     * 增值服务扩展属性
     * <pre>
     * 是否必填： 条件
     * </pre>
     */
    private String value1;

    /**
     * 增值服务扩展属性2
     * <pre>
     * 是否必填： 条件
     * </pre>
     */
    private String value2;

    /**
     * 增值服务扩展属性3
     * <pre>
     * 是否必填： 条件
     * </pre>
     */
    private String value3;

    /**
     * 增值服务扩展属性4
     * <pre>
     * 是否必填： 条件
     * </pre>
     */
    private String value4;
}
