package com.hdy.weblog.admin.service;

import com.hdy.weblog.admin.model.vo.tag.AddTagReqVO;
import com.hdy.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.hdy.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.hdy.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.hdy.weblog.common.utils.PageResponse;
import com.hdy.weblog.common.utils.Response;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/14 10:37
 **/
public interface AdminTagService {

    /**
     * 添加标签
     *
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页
     *
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     *
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);


    /**
     * 根据标签关键词模糊查询
     *
     * @param searchTagReqVO
     * @return
     */
    Response searchTag(SearchTagReqVO searchTagReqVO);


    /**
     * 查询标签 Select 列表数据
     *
     * @return
     */
    Response findTagSelectList();
}
