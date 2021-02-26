package club.mrxiao.jdl.bean.print;

import lombok.Data;

import java.util.List;

/**
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
public class CustomAreaKeyResult {

    /**
     * 资源名
     */
    private String key;

    /**
     * 资源类型（ text 文本元素 line 线条元素 rect 长方形、正方形元素 barcode 条码标记元素 image 图片标记元素 qrcode 二维码标记元素 stable 表格标记元素 ellipse 椭圆标记元素 water 水印标记元素 backgroundtext 黑底白字标记元素 ）
     */
    private String type;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 表格中的元素只有资源类型是 stable 的才会有内容
     */
    private List<ColumnDo> columns;
}
