package com.hdy.weblog.admin.convert;

import com.hdy.weblog.admin.model.vo.article.FindArticleDetailRspVO;
import com.hdy.weblog.common.domain.dos.ArticleDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/21 15:13
 **/
@Mapper
public interface ArticleDetailConvert {

    /**
     * 初始化 convert 实例
     */
    ArticleDetailConvert INSTANCE = Mappers.getMapper(ArticleDetailConvert.class);

    /**
     * 将 DO 转化为 VO
     *
     * @param bean
     * @return
     */
    FindArticleDetailRspVO convertDO2VO(ArticleDO bean);

}
