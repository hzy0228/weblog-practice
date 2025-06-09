package com.hdy.weblog.web.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hdy.weblog.common.domain.dos.ArticleCategoryRelDO;
import com.hdy.weblog.common.domain.dos.ArticleDO;
import com.hdy.weblog.common.domain.dos.CategoryDO;
import com.hdy.weblog.common.domain.mapper.ArticleCategoryRelMapper;
import com.hdy.weblog.common.domain.mapper.ArticleMapper;
import com.hdy.weblog.common.domain.mapper.CategoryMapper;
import com.hdy.weblog.common.enums.ResponseCodeEnum;
import com.hdy.weblog.common.exception.BizException;
import com.hdy.weblog.common.utils.PageResponse;
import com.hdy.weblog.common.utils.Response;
import com.hdy.weblog.web.convert.ArticleConvert;
import com.hdy.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.hdy.weblog.web.model.vo.category.FindCategoryArticlePageListRspVO;
import com.hdy.weblog.web.model.vo.category.FindCategoryListRspVO;
import com.hdy.weblog.web.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/30 10:46
 **/
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ArticleCategoryRelMapper articleCategoryRelMapper;
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 获取分类列表
     *
     * @return
     */
    @Override
    public Response findCategoryList() {

        // 查询所有分类
        List<CategoryDO> categoryDOS = categoryMapper.selectList(Wrappers.emptyWrapper());

        // DO 转 VO
        List<FindCategoryListRspVO> vos = null;
        if (!CollectionUtils.isEmpty(categoryDOS)) {
            vos = categoryDOS.stream()
                    .map(categoryDO -> FindCategoryListRspVO.builder()
                            .id(categoryDO.getId())
                            .name(categoryDO.getName())
                            .build())
                    .collect(Collectors.toList());
        }

        return Response.success(vos);
    }

    /**
     * 获取分类下文章分页数据
     *
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    @Override
    public Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO) {
        Long current = findCategoryArticlePageListReqVO.getCurrent();
        Long size = findCategoryArticlePageListReqVO.getSize();
        Long categoryId = findCategoryArticlePageListReqVO.getId();

        CategoryDO categoryDO = categoryMapper.selectById(categoryId);

        // 判断该分类是否存在
        if (Objects.isNull(categoryDO)) {
            log.warn("==> 该分类不存在, categoryId :{}", categoryId);
            throw new BizException(ResponseCodeEnum.CATEGORY_NOT_EXISTED);
        }

        // 先查询该分类下所有关联的文章 ID
        List<ArticleCategoryRelDO> articleCategoryRelDOS = articleCategoryRelMapper.selectListByCategoryId(categoryId);

        // 若该分类下未发布任何文章
        if (CollectionUtils.isEmpty(articleCategoryRelDOS)){
            log.info("==> 该分类下还未发布任何文章, categoryId: {}", categoryId);
            return PageResponse.success(null, null);
        }

        List<Long> articleIds = articleCategoryRelDOS.stream()
                .map(ArticleCategoryRelDO::getArticleId)
                .collect(Collectors.toList());

        Page<ArticleDO> page = articleMapper.selectPageListByArticleIds(current,size,articleIds);
        List<ArticleDO> articleDOS = page.getRecords();

        List<FindCategoryArticlePageListRspVO> vos = null;
        if (!CollectionUtils.isEmpty(articleDOS)){
            vos = articleDOS.stream()
                    .map(articleDO -> ArticleConvert.INSTANCE.convertDO2CategoryArticleVO(articleDO))
                    .collect(Collectors.toList());

        }

        return PageResponse.success(page, vos);
    }
}
