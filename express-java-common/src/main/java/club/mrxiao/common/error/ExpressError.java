package club.mrxiao.common.error;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-16
 */
@Data
@Builder
public class ExpressError implements Serializable {

    private static final long serialVersionUID = 4468863173191913584L;

    /**
     * 错误代码.
     */
    private String errorCode;

    /**
     * 错误信息（如果可以翻译为中文，就为中文）
     */
    private String errorMsg;

    /**
     * json数据
     */
    private String json;


    @Override
    public String toString() {
        if (this.json == null) {
            return "错误代码：" + this.errorCode + ", 错误信息：" + this.errorMsg;
        }

        return "错误代码：" + this.errorCode + ", 错误信息：" + this.errorMsg + "，原始报文：" + this.json;
    }
}
