package com.hdy.weblog.common.constant;

import java.time.format.DateTimeFormatter;

/**
 * @Author: Hao-ZY
 * @Date: 2025/6/18 15:17
 **/
public interface Constants {
    /**
     * 月-日 格式
     */
    DateTimeFormatter MONTH_DAY_FORMATTER = DateTimeFormatter.ofPattern("MM-dd");

}
