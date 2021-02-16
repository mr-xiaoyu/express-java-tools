package club.mrxiao.sf.bean.routes;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 路由响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
public class RouteResp {

    /**
     * 顺丰运单号
     */
    private String mailNo;

    /**
     * 路由信息（列表）
     */
    private List<Route> routes;
}
