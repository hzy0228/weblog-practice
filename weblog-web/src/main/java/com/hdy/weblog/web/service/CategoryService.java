package com.hdy.weblog.web.service;

import com.hdy.weblog.common.utils.Response;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/30 10:43
 **/
public interface CategoryService {

    /**
     * 获取分类列表
     *
     * @return
     */
    Response findCategoryList();
}
