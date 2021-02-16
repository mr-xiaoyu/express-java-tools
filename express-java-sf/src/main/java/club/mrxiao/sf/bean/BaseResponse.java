package club.mrxiao.sf.bean;


import club.mrxiao.sf.util.json.SfGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * <pre>
 * 统一响应对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
@Data
public class BaseResponse {

    /**
     * API平台结果代码
     */
    private String apiResultCode;

    /**
     * API平台异常信息
     */
    private String apiErrorMsg;

    /**
     * API响应唯一号UUID
     */
    @SerializedName("apiResponseID")
    private String apiResponseId;

    /**
     * 业务处理详细结果
     */
    private String apiResultData;


    public static BaseResponse fromJson(String json) {
        return SfGsonBuilder.create().fromJson(json, BaseResponse.class);
    }
}
