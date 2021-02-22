package club.mrxiao.jdl.bean.order;

import lombok.Data;

/**
 * <pre>
 * 主品和赠品关系参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class LordGiftWaybillRelationDTO {

    /**
     * 主品订单号
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String lordOrderId;

    /**
     * 赠品订单号
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String giftOrderId;

}
