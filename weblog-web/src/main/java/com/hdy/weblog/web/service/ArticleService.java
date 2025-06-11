package com.hdy.weblog.web.service;

import com.hdy.weblog.common.utils.Response;
import com.hdy.weblog.web.model.vo.article.FindArticleDetailReqVO;
import com.hdy.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/29 10:31
 **/
public interface ArticleService {

    /**
     * 获取首页文章分页数据
     *
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);


    /**
     * 获取文章详情
     *
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}
