package com.hdy.weblog.common.domain.dos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @Author: Hao-ZY
 * @Date: 2025/6/16 16:24
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticlePublishCountDO {

    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 文章发布数量
     */
    private Long count;
}
