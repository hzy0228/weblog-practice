package com.hdy.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Hao-ZY
 * @Date: 2025/3/25 17:49
 * @description: Mybatis Plus 配置文件
 **/
@Configuration
@MapperScan("com.hdy.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}
