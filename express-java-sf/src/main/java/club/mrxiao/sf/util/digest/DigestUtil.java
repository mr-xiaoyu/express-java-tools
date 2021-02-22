package club.mrxiao.sf.util.digest;


import club.mrxiao.common.error.ExpressError;
import club.mrxiao.common.error.ExpressErrorException;
import cn.hutool.core.codec.Base64;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * <pre>
 * 签名工具
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
public class DigestUtil {

    /**
     * 获取签名
     * @param msgData 业务报文
     * @param timestamp 时间戳
     * @param checkWord 客户校验码
     * @return 签名
     */
    public static String getDigest(String msgData,Long timestamp,String checkWord) throws ExpressErrorException {
        String toVerifyText = msgData+timestamp+checkWord;
        try {
            toVerifyText = URLEncoder.encode(toVerifyText,"UTF-8");
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(toVerifyText.getBytes(StandardCharsets.UTF_8));
            byte[] md = md5.digest();
            return Base64.encode(md);
        }catch (Exception e){
            throw new ExpressErrorException(ExpressError.builder().errorMsg("签名生成发生错误").build(),e);
        }
    }
}
