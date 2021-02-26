package club.mrxiao.jdl.bean.print;

import lombok.Data;

/**
 * <pre>
 * 打印数据密文
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
public class PrePrintDataInfo {

    /**
     * 运单号
     */
    private String wayBillNo;

    /**
     * 加密的运单数据，如果code不为成功，则没有该字段
     */
    private String perPrintData;

    /**
     * 单个运单查询结果
     */
    private String code;

    /**
     * 单个运单查询响应信息
     */
    private String msg;

    /**
     * 包裹号
     */
    private String packageCode;
}
