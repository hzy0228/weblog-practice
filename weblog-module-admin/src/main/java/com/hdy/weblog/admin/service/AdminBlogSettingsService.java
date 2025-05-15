package com.hdy.weblog.admin.service;

import com.hdy.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.hdy.weblog.common.utils.Response;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/15 15:49
 **/
public interface AdminBlogSettingsService {


    /**
     * 更新博客设置信息
     *
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);


    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}
