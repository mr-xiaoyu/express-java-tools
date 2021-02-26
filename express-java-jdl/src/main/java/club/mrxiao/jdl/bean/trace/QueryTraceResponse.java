package club.mrxiao.jdl.bean.trace;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 查询物流轨迹（商家用）响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class QueryTraceResponse {

    /**
     * 返回状态码,100:成功；200:失败；500:系统异常
     */
    private Integer code;


    private String messsage;

    /**
     * 物流轨迹
     */
    private List<TraceDTO> data;
}
