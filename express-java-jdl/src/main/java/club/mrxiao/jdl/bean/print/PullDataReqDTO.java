package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * <pre>
 * 获取打印数据参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-22
 */
@Data
public class PullDataReqDTO {

    /**
     * pin授权码/商家授权pin
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String pin;

    /**
     * 参数,key有文档规范。电子面单商家编码:ewCustomerCode(String)（青龙业主号），商城商家编码:eCustomerCode(String)
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private Map<String, String> parameters;


    /**
     * 物流公司编码。京东快递：JD
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String cpCode;

    /**
     * 每次请求唯一，本次获取打印数据请求ID，长度不超过20位
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private String objectId;

    /**
     * 运单信息列表 最多支持10条
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private List<WayBillInfo> wayBillInfos;
}
