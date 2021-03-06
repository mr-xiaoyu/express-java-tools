package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 打印数据
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-03-06
 */
@Data
public class PrintJdlOrderParameters {

    /**
     * 打印机名称
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String printName;

    /**
     * 页面上下偏移量 单位mm
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private Integer offsetTop;

    /**
     * 页面左右偏移量 单位mm
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private Integer offsetLeft;

    /**
     * 标准模版链接
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String tempUrl;

    /**
     * 打印数据
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private List<String> printData;

    /**
     * 自定义区模板url
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String customTempUrl;

    /**
     * 自定义数据
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private List<Object> customData;
}
