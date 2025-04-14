package com.hdy.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdy.weblog.common.domain.dos.UserRoleDO;

import java.util.List;

/**
 * @Author: Hao-ZY
 * @Date: 2025/4/10 10:23
 **/
public interface UserRoleMapper extends BaseMapper<UserRoleDO> {

    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     */
    default List<UserRoleDO> selectByUsername(String username) {
        LambdaQueryWrapper<UserRoleDO> wrapper = new LambdaQueryWrapper();
        wrapper.eq(UserRoleDO::getUsername, username);

        return selectList(wrapper);
    }
}
