package club.mrxiao.sf.bean;

import club.mrxiao.common.error.ExpressErrorException;
import club.mrxiao.sf.config.SfConfig;
import club.mrxiao.sf.util.digest.DigestUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;

import java.io.Serializable;
import java.util.HashMap;

/**
 * <pre>
 * 统一请求对象
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2021-02-14
 */
public class BaseRequest extends HashMap<String, Object> implements Serializable {

    private static final long serialVersionUID = -3970454113165485881L;


    public BaseRequest(String serviceCode,String msgData) {
        put("requestID", IdUtil.fastSimpleUUID());
        put("serviceCode", serviceCode);
        put("msgData", msgData);
    }


    public void build(SfConfig config) throws ExpressErrorException {
        Long timestamp = DateUtil.currentSeconds();
        String msgData = (String)this.get("msgData");

        this.put("PartnerID",config.getCode());
        this.put("timestamp",timestamp);

        String digest = DigestUtil.getDigest(msgData,timestamp,config.getCheck());
        this.put("msgDigest",digest);
    }
}
