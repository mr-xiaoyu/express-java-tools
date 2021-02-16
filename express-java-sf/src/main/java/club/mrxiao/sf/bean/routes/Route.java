package club.mrxiao.sf.bean.routes;

import lombok.Data;

/**
 * <pre>
 * 路由对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
public class Route {

    /**
     * 路由节点发生的时间，格式：YYYY-MM-DD HH24:MM:SS，示例：2012-7-30 09:30:00
     */
    private String acceptTime;

    /**
     * 路由节点发生的地点
     */
    private String acceptAddress;

    /**
     * 路由节点具体描述
     */
    private String remark;

    /**
     * 路由节点操作码
     */
    private String opCode;
}
