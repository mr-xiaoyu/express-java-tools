package club.mrxiao.sf.bean.order;

import lombok.Data;

/**
 * <pre>
 * 路由标签数据详细数据
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
public class RouteLabelData {

    /**
     * 运单号
     */
    private String waybillNo;

    /**
     * 原寄地中转场
     */
    private String sourceTransferCode;

    /**
     * 原寄地城市代码
     */
    private String sourceCityCode;

    /**
     * 原寄地网点代码
     */
    private String sourceDeptCode;

    /**
     * 原寄地单元区域
     */
    private String sourceTeamCode;

    /**
     * 目的地城市代码
     */
    private String destCityCode;

    /**
     * 目的地网点代码
     */
    private String destDeptCode;

    /**
     * 目的地网点代码映射码
     */
    private String destDeptCodeMapping;

    /**
     * 目的地单元区域
     */
    private String destTeamCode;

    /**
     * 目的地单元区域映射码
     */
    private String destTeamCodeMapping;

    /**
     * 目的地中转场
     */
    private String destTransferCode;

    /**
     * <pre>
     * 打单时的路由标签信息
     * 如果是大网的路由标签,这里的值是目的地网点代码;
     * 如果是同城配的路由标签,这里的值是根据同城配的设置映射出来的值,不同的配置结
     * 果会不一样,不能根据-符号切分(如:上海同城配,可能是:集散点-目的地网点-接
     * 驳点,也有可能是目的地网点代码-集散点-接驳点)
     * </pre>
     */
    private String destRouteLabel;

    /**
     * 产品名称对应RLS:pro_name
     */
    private String proName;

    /**
     * 快件内容:如:C816、SP601
     */
    private String cargoTypeCode;

    /**
     * 时效代码, 如:T4
     */
    private String limitTypeCode;

    /**
     * 产品类型,如:B1
     */
    private String expressTypeCode;

    /**
     * 入港映射码
     */
    private String codingMapping;

    /**
     * 出港映射码
     */
    private String codingMappingOut;

    /**
     * XB标志 0:不需要打印XB;1:需要打印XB
     */
    private String xbFlag;

    /**
     * <pre>
     *     打印标志
     *     返回值总共有9位,每位只有0和1两种,0表示按丰密 面单默认的规则,1是显示,顺序如下,
     *     如111110000 表示打印寄方姓名、寄方 电话、寄方公司名、寄方 地址和重量,收方姓名、收方电话、收方公司和收方地址按丰密面单默认规则
     *     1:寄方姓名
     *     2:寄方电话
     *     3:寄方公司名
     *     4:寄方地址
     *     5:重量
     *     6:收方姓名
     *     7:收方电话
     *     8:收方公司名
     *     9:收方地址
     * </pre>
     */
    private String printFlag;

    /**
     * <pre>
     *     二维码
     *     根据规则生成字符串信息,格式为MMM={
     *     'k1':'(目的地中转场代码)',
     *     'k2':'(目的地原始网点代码)',
     *     'k3':'(目的地单元区域)',
     *     'k4':'(附件通过三维码(express_type_code、 limit_type_code、 cargo_type_code)映射时效类型)',
     *     'k5':'(运单号)',
     *     'k6':'(AB标识)',
     *     'k7':'(校验码)'}
     * </pre>
     */
    private String twoDimensionCode;

    /**
     * 时效类型:值为二维码中的K4
     */
    private String proCode;

    /**
     * <pre>
     * 打印图标
     * 根据托寄物判断需要打印的图标(重货,蟹类,生鲜,易碎，Z标)
     * 返回值有8位，每一位只有0和1两种，0表示按运单默认的规则，1表示显示。
     * 后面两位默认0备用。顺序如下：重货,蟹类,生鲜,易碎,医药类,Z标,0,0
     * 如：00000000表示不需要打印重货，蟹类，生鲜，易碎,医药,Z标,备用,备用
     * </pre>
     */
    private String printIcon;

    /**
     * AB标
     */
    private String abFlag;

    /**
     * <pre>
     * 查询出现异常时返回信息
     * 0 系统异常
     * 1 未找到面单
     * </pre>
     */
    private String errMsg;

    /**
     * 目的地口岸代码
     */
    private String destPortCode;

    /**
     * 目的国别(国别代码如:JP)
     */
    private String destCountry;

    /**
     * 目的地邮编
     */
    private String destPostCode;

    /**
     * 总价值(保留两位小数,数字类型,可补位)
     */
    private String goodsValueTotal;

    /**
     * 币种
     */
    private String currencySymbol;

    /**
     * 件数
     */
    private String goodsNumber;
}
