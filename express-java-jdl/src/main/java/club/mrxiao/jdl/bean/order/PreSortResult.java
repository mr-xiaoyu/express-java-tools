package club.mrxiao.jdl.bean.order;

import lombok.Data;

/**
 * <pre>
 * 预分拣结果信息对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-24
 */
@Data
public class PreSortResult {

    /**
     * 预分拣站点id
     */
    private Integer siteId;

    /**
     * 站点名称
     */
    private String siteName;

    /**
     * 路区
     */
    private String road;

    /**
     * 滑道号
     */
    private String slideNo;

    /**
     * 始发分拣中心id
     */
    private Integer sourceSortCenterId;

    /**
     * 始发分拣中心名称
     */
    private String sourceSortCenterName;

    /**
     * 始发滑道号
     */
    private String sourceCrossCode;

    /**
     * 始发笼车号
     */
    private String sourceTabletrolleyCode;

    /**
     * 目的分拣中心id
     */
    private Integer targetSortCenterId;

    /**
     * 目的分拣中心名称
     */
    private String targetSortCenterName;

    /**
     * 目的笼车号
     */
    private String targetTabletrolleyCode;

    /**
     * 时效
     */
    private Integer aging;

    /**
     * 时效名称
     */
    private String agingName;

    /**
     * 站点类型
     */
    private Integer siteType;

    /**
     * 是否隐藏姓名
     */
    private Integer isHideName;

    /**
     * 是否隐藏联系方式
     */
    private Integer isHideContractNumbers;
}
