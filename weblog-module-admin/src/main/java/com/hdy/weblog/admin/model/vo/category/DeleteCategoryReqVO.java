package com.hdy.weblog.admin.model.vo.category;

import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/12 14:50
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "删除分类 VO")
public class DeleteCategoryReqVO {

    @NotNull(message = "分类 ID 不能为空")
    private Long id;

}
