package com.hdy.weblog.web.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Hao-ZY
 * @Date: 2025/3/24 15:06
 **/
@RestController
@Slf4j
@Api(tags = "首页模块")
public class TestController {

//    @PostMapping("/admin/test")
//    @ApiOperationLog(description = "测试接口")
//    @ApiOperation(value = "测试接口")
//    public Response test(@RequestBody @Validated User user) {
//        // 打印入参
//        log.info(JsonUtil.toJsonString(user));
//
//        // 设置三种日期字段值
//        user.setCreateTime(LocalDateTime.now());
//        user.setUpdateDate(LocalDate.now());
//        user.setTime(LocalTime.now());
//
//        return Response.success(user);
//    }
//
//    @PostMapping("/admin/update")
//    @ApiOperationLog(description = "测试更新接口")
//    @ApiOperation(value = "测试更新接口")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public Response testUpdate() {
//        log.info("更新成功...");
//        return Response.success();
//    }

}
