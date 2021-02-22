package club.mrxiao.jdl.bean.order;

import lombok.Data;

/**
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class CustomerBoxDTO {

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private String customerBoxCode;

    /**
     * <pre>
     *     是否必填：否
     * </pre>
     */
    private Integer customerBoxNumber;
}
