package club.mrxiao.sf.bean.routes;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * 路由查询请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
@Builder
public class SearchRoutesRequest implements Serializable {

    private static final long serialVersionUID = 4382395931271225154L;

    /**
     * 接口服务代码
     */
    private static final String SERVICE_CODE = "EXP_RECE_SEARCH_ROUTES";

    /**
     * 返回描述语语言，0：中文 1：英文 2：繁体
     * <pre>
     * 是否必填： 否
     * 默认值： 0
     * </pre>
     */
    private Integer language;

    /**
     * <pre>
     * 查询号类别:
     * 1:根据顺丰运单号查询,trackingNumber将被当作顺丰运单号处理
     * 2:根据客户订单号查询,trackingNumber将被当作客户订单号处理
     * </pre>
     * <pre>
     * 是否必填： 否
     * 默认值： 1
     * </pre>
     */
    private Integer trackingType;

    /**
     * <pre>
     * 查询号:
     * trackingType=1,则此值为顺丰运单号
     * trackingType=2,则此值为客户订单号
     * </pre>
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private List<String> trackingNumber;

    /**
     * <pre>
     * 路由查询类别:
     * 1:标准路由查询
     * 2:定制路由查询
     * </pre>
     * <pre>
     * 是否必填： 否
     * 默认值： 1
     * </pre>
     */
    private Integer methodType;

    /**
     * 参考编码(目前针对亚马逊客户,由客户传)
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String referenceNumber;

    /**
     * 电话号码验证
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String checkPhoneNo;

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
