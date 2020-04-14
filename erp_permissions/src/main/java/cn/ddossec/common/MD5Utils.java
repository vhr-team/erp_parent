package cn.ddossec.common;

import org.apache.shiro.crypto.hash.Md5Hash;

import java.util.UUID;

/**
 * @author: 唐颖豪
 * @create: 2020年4月14日20:38:13
 **/
public class MD5Utils {

    /**
     * 生成uuid
     *
     * @return
     */
    public static String createUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 加密
     * @param source
     * @param slat
     * @param hashIterations
     * @return
     */
    public static String md5(String source, String slat, Integer hashIterations) {
        Md5Hash hash = new Md5Hash(source, slat, hashIterations);
        return hash.toString();
    }


}
