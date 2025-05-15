package com.hdy.weblog.admin.convert;

import com.hdy.weblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.hdy.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.hdy.weblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/15 16:17
 **/
@Mapper
public interface BlogSettingsConvert {

    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     *
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

    /**
     * 将 DO 转化为 VO
     *
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);
}
