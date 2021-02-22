package club.mrxiao.sf.bean.order;

import lombok.Data;

/**
 * <pre>
 * 收寄双方信息
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class ContactInfo {

    /**
     * 地址类型:1，寄件方信息 2，到件方信息
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private Integer contactType;

    /**
     * 公司名称
     * <pre>
     * 是否必填： 条件
     * </pre>
     */
    private String company;

    /**
     * 联系人
     * <pre>
     * 是否必填： 条件
     * </pre>
     */
    private String contact;


    /**
     * 联系电话
     * <pre>
     * 是否必填： 条件
     * </pre>
     */
    private String tel;

    /**
     * 手机
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String mobile;

    /**
     * 城市代码或国家代码
     * <pre>
     * 是否必填： 如果是跨境件，则此字段为必填
     * </pre>
     */
    private String zoneCode;

    /**
     * 国家或地区2位代码
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String country;


    /**
     * 所在省级行政区名称
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String province;

    /**
     * 所在地级行政区名称
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String city;

    /**
     * 所在县/区级行政区名称
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String county;

    /**
     * 详细地址
     * <pre>
     * 是否必填： 若province/city字段的值不传，此字段必须包含省市信息，避免影响原寄地代码识别，如：广东省深圳市福田区新洲十一街万基商务大厦10楼；若需要生成电子运单，则为必填
     * </pre>
     */
    private String address;

    /**
     * 邮编
     * <pre>
     * 是否必填： 跨境件必填（中国内地，港澳台互寄除外）
     * </pre>
     */
    private String postCode;

    /**
     * 邮箱地址
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String email;

    /**
     * 税号
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String taxNo;
}
