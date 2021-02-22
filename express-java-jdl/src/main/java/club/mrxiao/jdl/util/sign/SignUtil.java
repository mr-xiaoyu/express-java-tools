package club.mrxiao.jdl.util.sign;

import club.mrxiao.common.error.ExpressError;
import club.mrxiao.common.error.ExpressErrorException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * <pre>
 * 签名工具
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-22
 */
public class SignUtil {

    /**
     * 获取签名
     * @param param 签名参数
     * @param appSecret appSecret
     * @return 签名
     */
    public static String getSign(Map<String,String> param,String appSecret) throws ExpressErrorException {
        StringBuilder s = new StringBuilder(appSecret);
        for (Map.Entry<String, String> entry : param.entrySet()) {
            s.append(entry.getKey()).append(entry.getValue());
        }
        s.append(appSecret);
        return md5(s.toString()).toUpperCase();
    }

    /**
     * URLEncoder.encode
     * @param param 参数
     * @return 结果
     */
    public static String encode(String param) throws ExpressErrorException {
        try {
            return URLEncoder.encode(param,"utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("URLEncoder.encode发生错误").build(),e);
        }
    }

    /**
     * md5编码
     * @param source 值
     * @return md5编码后的值
     */
    public static String md5(String source) throws ExpressErrorException {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new ExpressErrorException(ExpressError.builder().errorCode("9999").errorMsg("签名时发生错误").build(),e);
        }
        byte[] bytes = md.digest(source.getBytes(StandardCharsets.UTF_8));
        return byte2hex(bytes);
    }

    private static String byte2hex(byte[] bytes) {
        StringBuilder sign = new StringBuilder();
        for (byte aByte : bytes) {
            String hex = Integer.toHexString(aByte & 0xFF);
            if (hex.length() == 1) {
                sign.append("0");
            }
            sign.append(hex.toUpperCase());
        }
        return sign.toString();
    }
}
