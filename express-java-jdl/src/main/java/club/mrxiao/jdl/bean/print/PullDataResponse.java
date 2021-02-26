package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * 获取打印数据响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
public class PullDataResponse {

    /**
     * 响应码
     */
    private String code;

    /**
     * 响应码
     */
    private String message;

    /**
     * 源传入本次打印数据请求ID
     */
    private String objectId;

    /**
     * 打印数据密文列表
     */
    private List<PrePrintDataInfo> prePrintDatas;
}
