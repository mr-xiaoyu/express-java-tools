package club.mrxiao.jdl.bean.trace;

import lombok.Data;

/**
 * <pre>
 * 查询物流轨迹参数对象(商家用)
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class TraceQueryDTO {

    /**
     * 商家编码，自动添加
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String customerCode;

    /**
     * 运单号或者是取件单号
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String waybillCode;

    /**
     * 京东pin，自动添加
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String josPin;
}
