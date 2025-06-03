package com.hdy.weblog.web.service;

import com.hdy.weblog.common.utils.Response;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/30 14:13
 **/
public interface TagService {

    /**
     * 获取标签列表
     *
     * @return
     */
    Response findTagList();

}
