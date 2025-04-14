package com.hdy.weblog.web;

import com.hdy.weblog.common.domain.dos.UserDO;
import com.hdy.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    void contextLoads() {
    }

    @Test
    void testLog() {
        log.info("这是一行 Info 级别日志");
        log.warn("这是一行 Warn 级别日志");
        log.error("这是一行 Error 级别日志");

        // 占位符
        String author = "hdy";
        log.info("这是一行带有占位符日志，作者：{}", author);
    }


    @Test
    void insertTest() {
        // 构建数据库实体类
        UserDO userDO = UserDO.builder()
                .username("hdy")
                .password("123456")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();

        userMapper.insert(userDO);
    }


    @Test
    void test(){
        // 定义起始日期和结束日期
        LocalDate startDate = LocalDate.of(2025, 6, 1); // 起始日期：2025年4月1日
        LocalDate endDate = LocalDate.of(2025, 12, 31);  // 结束日期：2025年5月31日

        // 定义日期格式化器 (YYYYMMDD 格式)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // 遍历起始日期到结束日期之间的每一天
        LocalDate currentDate = startDate;
        StringBuilder result = new StringBuilder();
        while (!currentDate.isAfter(endDate)) {
            // 格式化当前日期为 YYYYMMDD 格式，并添加一个空格
            result.append(currentDate.format(formatter)).append(" ");

            // 移动到下一天
            currentDate = currentDate.plusDays(1);
        }

        // 去掉最后一个多余的空格
        if (result.length() > 0) {
            result.setLength(result.length() - 1); // 删除最后一个空格
        }

        // 输出结果到控制台
        System.out.println(result.toString());
    }

}
