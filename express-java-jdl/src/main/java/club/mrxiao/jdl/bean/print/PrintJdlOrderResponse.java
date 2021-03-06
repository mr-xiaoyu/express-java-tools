package club.mrxiao.jdl.bean.print;

import lombok.Data;

/**
 * <pre>
 * 打印数据响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-03-06
 */
@Data
public class PrintJdlOrderResponse {

    /**
     * 单据或指令类型 1、PRE_View  打印预览  2、GET_Printers 打印列表 3、PRINT  打印
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String orderType;

    /**
     * 唯一任务ID
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String key;

    /**
     * 参数
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private PrintJdlOrderParameters parameters;
}
