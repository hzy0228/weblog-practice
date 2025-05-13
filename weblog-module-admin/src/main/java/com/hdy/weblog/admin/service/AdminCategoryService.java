package com.hdy.weblog.admin.service;

import com.hdy.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.hdy.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.hdy.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.hdy.weblog.common.utils.PageResponse;
import com.hdy.weblog.common.utils.Response;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/9 16:11
 **/
public interface AdminCategoryService {

    /**
     * 添加分类
     *
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     *
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     *
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();

}
