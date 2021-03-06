package club.mrxiao.sf.bean.print;

import club.mrxiao.sf.config.SfConfig;
import cn.hutool.core.util.IdUtil;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * <pre>
 * 打印数据响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-03-06
 */
@Data
public class PrintSfOrderResponse {

    /**
     * 给每个系统分配的秘钥
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String appKey;

    /**
     * 系统编码
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String sysCode;

    /**
     * 请求的命令：print：打印preview：预览getPrinters：获取打印机列表
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private String commond;

    /**
     * 发送请求中的ID,原封不动返回，使客户端能识别出哪个请求对应的响应
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String requestID;

    /**
     * 模板编码
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private String templateCode;

    /**
     * 扩展属性，指定打印机，指定打印哪一联等参数举例如下：{"printerName":"GnetPrinter", "areas":["master"]}
     * <pre>
     * 是否必填： 否
     * </pre>
     */
    private Map<String,Object> attributes;

    /**
     * 面单数据
     * <pre>
     * 是否必填： 是
     * </pre>
     */
    private List<PrintSfOrderDocument> documents;


    public PrintSfOrderResponse(SfConfig config){

        this.appKey = config.getPrintKey();
        this.sysCode = config.getPrintCode();
        this.templateCode = config.getPrintTemplateCode();
        this.requestID = IdUtil.fastSimpleUUID();
    }
}
