package club.mrxiao.jdl.bean.print;

import lombok.Data;

/**
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-26
 */
@Data
public class ColumnDo {

    /**
     * 表格中列名
     */
    private String key;

    /**
     * 表格中列描述
     */
    private String name;

    /**
     * 类型
     */
    private String type;
}
