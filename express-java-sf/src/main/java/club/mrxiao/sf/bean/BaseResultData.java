package club.mrxiao.sf.bean;

import club.mrxiao.sf.util.json.SfGsonBuilder;
import com.google.gson.JsonElement;
import lombok.Data;

/**
 * <pre>
 * 统一处理结果对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-16
 */
@Data
public class BaseResultData<T> {

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误消息
     */
    private String errorMsg;

    /**
     * 响应数据
     */
    private JsonElement msgData;

    public static BaseResultData fromJson(String json) {
        return SfGsonBuilder.create().fromJson(json, BaseResultData.class);
    }
}
