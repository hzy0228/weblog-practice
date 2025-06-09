package com.hdy.weblog.web.service;

import com.hdy.weblog.common.utils.Response;
import com.hdy.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @Author: Hao-ZY
 * @Date: 2025/6/3 16:39
 **/
public interface ArchiveService {

    /**
     * 获取文章归档分页数据
     *
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
