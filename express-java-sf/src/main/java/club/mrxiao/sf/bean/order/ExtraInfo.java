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
public class ExtraInfo implements Serializable {

    private static final long serialVersionUID = -8047952407253756823L;


    /**
     * 扩展字段说明：attrName为字段定义，具体如下表，value存在attrVal
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String attrName;

    /**
     * 扩展字段值
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String attrVal;
}
