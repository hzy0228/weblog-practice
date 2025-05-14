package com.hdy.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hdy.weblog.common.domain.dos.TagDO;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/14 10:25
 **/
public interface TagMapper extends BaseMapper<TagDO> {

    /**
     * 查询标签分页数据
     *
     * @param current
     * @param size
     * @param name
     * @param startDate
     * @param endDate
     * @return
     */
    default Page<TagDO> selectPageList(Long current, Long size, String name, LocalDate startDate, LocalDate endDate) {
        // 分页对象(查询第几页、每页多少数据)
        Page<TagDO> page = new Page<>(current, size);

        // 构建查询条件
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();

        wrapper
                .like(Objects.nonNull(name), TagDO::getName, name) // like 模块查询
                .ge(Objects.nonNull(startDate), TagDO::getCreateTime, startDate) // 大于等于 startDate
                .le(Objects.nonNull(endDate), TagDO::getCreateTime, endDate)  // 小于等于 endDate
                .orderByDesc(TagDO::getCreateTime); // 按创建时间倒叙

        return selectPage(page, wrapper);
    }


    /**
     * 根据标签关键词模糊查询
     *
     * @param key
     * @return
     */
    default List<TagDO> selectByKey(String key) {
        // 构建查询条件
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();

        wrapper.like(TagDO::getName, key).orderByDesc(TagDO::getCreateTime);

        return selectList(wrapper);
    }
}
