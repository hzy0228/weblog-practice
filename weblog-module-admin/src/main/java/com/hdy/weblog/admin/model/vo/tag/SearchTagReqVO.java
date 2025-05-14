package com.hdy.weblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/14 17:00
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "标签模糊查询 VO")
public class SearchTagReqVO {

    @NotBlank(message = "标签模糊查询关键词不能为空")
    private String key;
}
