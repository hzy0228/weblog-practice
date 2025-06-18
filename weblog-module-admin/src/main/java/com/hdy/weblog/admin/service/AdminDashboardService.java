package com.hdy.weblog.admin.service;

import com.hdy.weblog.common.utils.Response;

/**
 * @Author: Hao-ZY
 * @Date: 2025/6/16 11:20
 **/
public interface AdminDashboardService {


    /**
     * 获取仪表盘基础统计信息
     *
     * @return
     */
    Response findDashboardStatistics();

    /**
     * 获取文章发布热点统计信息
     * @return
     */
    Response findDashboardPublishArticleStatistics();

    /**
     * 获取文章最近一周 PV 访问量统计信息
     * @return
     */
    Response findDashboardPVStatistics();
}
