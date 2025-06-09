package com.hdy.weblog.web.model.vo.archive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;
import java.util.List;

/**
 * @Author: Hao-ZY
 * @Date: 2025/6/3 16:19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindArchiveArticlePageListRspVO {

    /**
     * 归档月份
     */
    private YearMonth month;

    private List<FindArchiveArticleRspVO> articles;
}
