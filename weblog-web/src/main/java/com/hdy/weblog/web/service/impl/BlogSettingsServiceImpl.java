package com.hdy.weblog.web.service.impl;

import com.hdy.weblog.common.domain.dos.BlogSettingsDO;
import com.hdy.weblog.common.domain.mapper.BlogSettingsMapper;
import com.hdy.weblog.common.utils.Response;
import com.hdy.weblog.web.convert.BlogSettingsConvert;
import com.hdy.weblog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import com.hdy.weblog.web.service.BlogSettingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/30 16:21
 **/
@Service
@Slf4j
public class BlogSettingsServiceImpl implements BlogSettingsService {

    @Autowired
    private BlogSettingsMapper blogSettingsMapper;


    /**
     * 获取博客设置信息
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询博客设置信息（约定的 ID 为 1）
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);
        // DO 转 VO
        FindBlogSettingsDetailRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}
