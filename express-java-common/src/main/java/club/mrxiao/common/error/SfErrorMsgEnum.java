package club.mrxiao.common.error;

import lombok.Getter;

/**
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-16
 */
@Getter
public enum SfErrorMsgEnum {

    /**
     * 校验成功,不代表后端业务处理成功
     */
    CODE_A1000("A1000", "统一接入平台校验成功，调用后端服务成功;注意：不代表后端业务处理成功，实际业务处理结果，需要查看响应属性apiResultData中的详细结果"),

    /**
     * 必传参数不可为空
     */
    CODE_A1001("A1001", "必传参数不可为空"),

    /**
     * 请求时效已过期
     */
    CODE_A1002("A1002", "请求时效已过期"),

    /**
     * 请求时效已过期
     */
    CODE_A1003("A1003", "IP无效"),

    /**
     * 请求时效已过期
     */
    CODE_A1004("A1004", "无对应服务权限"),

    /**
     * 请求时效已过期
     */
    CODE_A1005("A1005", "流量受控"),

    /**
     * 请求时效已过期
     */
    CODE_A1006("A1006", "数字签名无效"),

    /**
     * 请求时效已过期
     */
    CODE_A1007("A1007", "重复请求"),

    /**
     * 请求时效已过期
     */
    CODE_A1008("A1008", "数据解密失败"),

    /**
     * 请求时效已过期
     */
    CODE_A1009("A1009", "目标服务异常或不可达"),

    /**
     * 请求时效已过期
     */
    CODE_A1099("A1099", "系统异常");

    private String code;
    private String msg;

    SfErrorMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 通过错误代码查找其中文含义.
     */
    public static String findMsgByCode(String code) {
        for (SfErrorMsgEnum value : SfErrorMsgEnum.values()) {
            if (value.code.equals(code)) {
                return value.msg;
            }
        }

        return null;
    }
}
