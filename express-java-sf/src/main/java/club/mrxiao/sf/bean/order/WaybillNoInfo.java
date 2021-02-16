package club.mrxiao.sf.bean.order;

import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 * 顺丰运单号
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class WaybillNoInfo implements Serializable {

    private static final long serialVersionUID = -48743451697427311L;

    /**
     * 运单号类型1：母单 2 :子单 3 : 签回单
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Integer waybillType;

    /**
     * 运单号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String waybillNo;
}
