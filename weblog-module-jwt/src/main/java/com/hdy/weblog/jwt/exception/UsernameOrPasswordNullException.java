package com.hdy.weblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author: Hao-ZY
 * @Date: 2025/3/26 15:26
 **/
public class UsernameOrPasswordNullException extends AuthenticationException {

    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
