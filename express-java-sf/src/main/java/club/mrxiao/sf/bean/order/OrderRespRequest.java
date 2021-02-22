package club.mrxiao.sf.bean.order;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.Builder;
import lombok.Data;

/**
 * <pre>
 * 订单结果查询请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
@Builder
public class OrderRespRequest {

    /**
     * 接口服务代码
     */
    private static final String SERVICE_CODE = "EXP_RECE_SEARCH_ORDER_RESP";

    /**
     * 语言(返回描述语)
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String language;

    /**
     * 客户订单号
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String orderId;


    /**
     * 查询类型：1.正向单查询，传入的orderId为正向订单号，2.退货单查询，传入的orderId为退货原始订单号
     * <pre>
     * 是否必填： 否
     * 默认值： 1
     * </pre>
     */
    private String searchType;


    /**
     * 获取接口服务代码
     * @return 接口服务代码
     */
    public String getServiceCode(){
        return SERVICE_CODE;
    }

    /**
     * 转json
     * @return json数据
     */
    public String toJson() {
        return SfGsonBuilder.create().toJson(this);
    }
}
