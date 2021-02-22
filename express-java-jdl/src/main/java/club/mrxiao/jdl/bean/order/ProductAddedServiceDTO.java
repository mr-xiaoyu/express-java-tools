package club.mrxiao.jdl.bean.order;

import lombok.Data;

import java.util.Map;

/**
 * <pre>
 * 商品补充信息参数对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class ProductAddedServiceDTO {

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String type;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String primaryParam;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private String secondaryParam;

    /**
     * <pre>
     * 是否必填：否
     * </pre>
     */
    private Map<String, String> otherParams;
}
