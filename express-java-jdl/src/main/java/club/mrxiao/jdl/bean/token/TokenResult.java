package club.mrxiao.jdl.bean.token;

import club.mrxiao.jdl.util.json.JdlGsonBuilder;
import lombok.Data;

/**
 * <pre>
 * token请求响应
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class TokenResult {
    private Token model;
    private boolean success;
    private String errMsg;
    private String errCode;

    public static TokenResult fromJson(String json) {
        return JdlGsonBuilder.create().fromJson(json, TokenResult.class);
    }
}
