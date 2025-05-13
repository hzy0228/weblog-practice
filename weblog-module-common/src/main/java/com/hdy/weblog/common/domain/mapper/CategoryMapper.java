package com.hdy.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdy.weblog.common.domain.dos.CategoryDO;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/9 15:57
 **/
public interface CategoryMapper extends BaseMapper<CategoryDO> {

    /**
     * 根据用户名查询
     *
     * @param categoryName
     * @return
     */
    default CategoryDO selectByName(String categoryName) {
        // 构建查询条件
        LambdaQueryWrapper<CategoryDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(CategoryDO::getName, categoryName);

        // 执行查询
        return selectOne(wrapper);

    }
}
