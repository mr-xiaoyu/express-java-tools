package club.mrxiao.jdl.bean.trace;

import lombok.Data;

/**
 * <pre>
 * 物流轨迹（给消费者）对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class ExtTraceDTO {

    private String waybillCode;

    private String operateDesc;

    private String operateMessage;

    private String operateName;

    private Long operateTime;

    private Integer operateSiteId;

    private Integer state;

    private Integer signType;
}
