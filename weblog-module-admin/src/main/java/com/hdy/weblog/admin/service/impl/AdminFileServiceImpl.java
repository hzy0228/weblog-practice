package com.hdy.weblog.admin.service.impl;

import com.hdy.weblog.admin.model.vo.file.UploadFileRspVO;
import com.hdy.weblog.admin.service.AdminFileService;
import com.hdy.weblog.admin.utils.MinioUtil;
import com.hdy.weblog.common.enums.ResponseCodeEnum;
import com.hdy.weblog.common.exception.BizException;
import com.hdy.weblog.common.utils.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/15 14:56
 **/
@Slf4j
@Service
public class AdminFileServiceImpl implements AdminFileService {

//    @Autowired
//    private MinioUtil minioUtil;
//
//
//    /**
//     * 上传文件
//     *
//     * @param file
//     * @return
//     */
//    @Override
//    public Response uploadFile(MultipartFile file) {
//
//        try {
//            String url = minioUtil.uploadFile(file);
//
//            return Response.success(UploadFileRspVO.builder().url(url).build());
//        } catch (Exception e) {
//            log.error("==> 上传文件至 Minio 错误:", e);
//            throw new BizException(ResponseCodeEnum.FILE_UPLOAD_FAILED);
//        }
//    }
}
