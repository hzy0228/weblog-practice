package com.hdy.weblog.web.service;

import com.hdy.weblog.common.utils.Response;
import com.hdy.weblog.web.model.vo.tag.FindTagArticlePageListReqVO;

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


    /**
     * 获取标签下文章分页列表
     *
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
