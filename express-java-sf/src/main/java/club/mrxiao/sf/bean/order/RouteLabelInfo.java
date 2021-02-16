package club.mrxiao.sf.bean.order;

import lombok.Data;

/**
 * <pre>
 * 路由标签
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-17
 */
@Data
public class RouteLabelInfo {

    /**
     * 返回调用结果，1000：调用成功；其他调用失败
     */
    private String code;

    /**
     * 失败异常描述
     */
    private String message;

    /**
     * 路由标签数据详细数据
     */
    private RouteLabelData routeLabelData;
}
