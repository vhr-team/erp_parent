package cn.ddossec.common.upload;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author 30315
 * @title: UploadProperties
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1520:19
 */
@ConfigurationProperties(prefix = "upload")
@Data
public class UploadProperties {

    private String baseUrl;

    private List<String> allowTypes;
}
