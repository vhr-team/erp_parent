package cn.ddossec.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: 唐颖豪
 **/
@ConfigurationProperties(prefix = "shiro")
@Data
public class ShiroProperties {

    private String hashAlgorithmName = "md5";

    private Integer hashIterations = 2;

    private String loginUrl;

    private String unauthorizedUrl;

    private String[] anonUrls;

    private String logoutUrl;

    private String[] authcUrls;

}
