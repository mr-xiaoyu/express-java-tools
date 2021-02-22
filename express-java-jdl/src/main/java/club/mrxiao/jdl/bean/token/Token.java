package club.mrxiao.jdl.bean.token;

import lombok.Data;

/**
 * <pre>
 * token信息
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-19
 */
@Data
public class Token {
    private String clientId;
    private String refreshExpire;
    private String code;
    private String refreshToken;
    private String accessExpire;
    private String sellerId;
    private String accessToken;
}
