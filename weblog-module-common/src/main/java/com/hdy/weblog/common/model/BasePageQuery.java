package com.hdy.weblog.common.model;

import lombok.Data;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/9 16:33
 **/
@Data
public class BasePageQuery {
    /**
     * 当前页码, 默认第一页
     */
    private Long current = 1L;
    /**
     * 每页展示的数据数量，默认每页展示 10 条数据
     */
    private Long size = 10L;
}
