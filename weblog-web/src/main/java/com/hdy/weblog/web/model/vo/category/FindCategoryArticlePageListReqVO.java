package com.hdy.weblog.web.model.vo.category;

import com.hdy.weblog.common.model.BasePageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Author: Hao-ZY
 * @Date: 2025/6/6 9:41
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryArticlePageListReqVO extends BasePageQuery {


    /**
     * 分类 ID
     */
    @NotNull(message = "分类 ID 不能为空")
    private Long id;
}
