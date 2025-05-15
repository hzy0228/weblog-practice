package com.hdy.weblog.admin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/15 14:25
 **/
@ConfigurationProperties(prefix = "minio")
@Component
@Data
public class MinioProperties {

//    private String endpoint;
//    private String accessKey;
//    private String secretKey;
//    private String bucketName;
}


