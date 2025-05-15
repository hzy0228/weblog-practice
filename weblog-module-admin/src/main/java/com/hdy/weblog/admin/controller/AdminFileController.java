package com.hdy.weblog.admin.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/15 15:36
 **/
@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 文件模块")
public class AdminFileController {

//    @Autowired
//    private AdminFileService fileService;
//
//
//    @PostMapping("/file/upload")
//    @ApiOperation(value = "文件上传")
//    @ApiOperationLog(description = "文件上传")
//    public Response uploadFile(@RequestParam MultipartFile file) {
//        return fileService.uploadFile(file);
//    }
}
