package club.mrxiao.jdl.bean.print;

import club.mrxiao.jdl.bean.BaseRequest;
import club.mrxiao.jdl.util.json.JdlGsonBuilder;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 获取打印数据请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class PullDataRequest extends BaseRequest {

    /**
     * 服务域
     */
    private static final String LOP_DN= "jdcloudprint";

    /**
     * API url
     */
    private static final String METHOD = "/PullDataService/pullData";

    /**
     * 获取打印数据参数对象
     * <pre>
     * 是否必填：是
     * </pre>
     */
    private PullDataReqDTO pullDataReqDTO;


    @Override
    public String getJsonParams() {
        List<PullDataReqDTO> list = new ArrayList<>();
        list.add(this.pullDataReqDTO);
        return JdlGsonBuilder.create().toJson(list);
    }

    @Override
    public String getLopDn() {
        return LOP_DN;
    }

    @Override
    public String getMethod() {
        return METHOD;
    }
}
