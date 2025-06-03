package com.hdy.weblog.web.service;

import com.hdy.weblog.common.utils.Response;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/30 16:20
 **/
public interface BlogSettingsService {

    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
