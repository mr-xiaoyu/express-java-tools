package club.mrxiao.jdl.bean.trace;

import lombok.Data;

/**
 * <pre>
 * 物流轨迹（商家用）对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class TraceDTO {

    /**
     * 操作简要描述
     */
    private String opeTitle;

    /**
     * 操作详情
     */
    private String opeRemark;

    /**
     * 操作人姓名
     */
    private String opeName;

    /**
     * 操作时间
     */
    private String opeTime;

    /**
     * 运单号
     */
    private String waybillCode;

    /**
     * 配送员姓名
     */
    private String courier;

    /**
     * 配送员电话
     */
    private String courierTel;
}
