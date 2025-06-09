package com.hdy.weblog.web.service;

import com.hdy.weblog.common.utils.Response;
import com.hdy.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;

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


    /**
     * 获取分类下文章分页数据
     *
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
