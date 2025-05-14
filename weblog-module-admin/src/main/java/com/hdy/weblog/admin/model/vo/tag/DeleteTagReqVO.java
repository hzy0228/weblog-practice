package com.hdy.weblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/14 14:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "删除标签 VO")
public class DeleteTagReqVO {


    @NotNull(message = "标签 ID 不能为空")
    private Long id;
}
