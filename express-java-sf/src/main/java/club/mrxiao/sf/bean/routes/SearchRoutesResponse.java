package club.mrxiao.sf.bean.routes;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 路由查询响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
public class SearchRoutesResponse {

    /**
     * 顺丰运单号对应的路由详情（列表）
     */
    private List<RouteResp> routeResps;

    public static SearchRoutesResponse fromJson(String json) {
        return SfGsonBuilder.create().fromJson(json, SearchRoutesResponse.class);
    }
}
