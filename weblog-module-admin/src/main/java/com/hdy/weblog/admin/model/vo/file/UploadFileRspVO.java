package com.hdy.weblog.admin.model.vo.file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/15 14:43
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UploadFileRspVO {


    /**
     * 文件的访问链接
     */
    private String url;
}
