package com.hdy.weblog.common.aspect;

import java.lang.annotation.*;

/**
 * @Author: Hao-ZY
 * @Date: 2025/3/20 17:00
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {

    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}
