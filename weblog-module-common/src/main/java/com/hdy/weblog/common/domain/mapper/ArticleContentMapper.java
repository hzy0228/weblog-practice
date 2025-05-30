package com.hdy.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hdy.weblog.common.domain.dos.ArticleContentDO;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/16 9:36
 **/
public interface ArticleContentMapper extends BaseMapper<ArticleContentDO> {


    /**
     * 根据文章 ID 删除记录
     *
     * @param articleId
     * @return
     */
    default int deleteByArticleId(Long articleId) {
        return delete(Wrappers.<ArticleContentDO>lambdaQuery()
                .eq(ArticleContentDO::getArticleId, articleId));
    }


    /**
     * 根据文章 ID 查询
     *
     * @param articleId
     * @return
     */
    default ArticleContentDO selectByArticleId(Long articleId) {
        return selectOne(
                Wrappers.<ArticleContentDO>lambdaQuery().eq(ArticleContentDO::getArticleId, articleId)
        );
    }


    /**
     * 通过文章 ID 更新
     *
     * @param articleContentDO
     * @return
     */
    default int updateByArticleId(ArticleContentDO articleContentDO) {
        return update(articleContentDO, Wrappers.<ArticleContentDO>lambdaQuery().eq(ArticleContentDO::getArticleId, articleContentDO.getArticleId()));
    }
}
