package com.hdy.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdy.weblog.common.domain.dos.UserDO;

import java.time.LocalDateTime;

/**
 * @Author: Hao-ZY
 * @Date: 2025/3/25 17:51
 **/
public interface UserMapper extends BaseMapper<UserDO> {

    default UserDO findByUsername(String username) {
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper();
        wrapper.eq(UserDO::getUsername, username);
        return selectOne(wrapper);
    }

    default int updatePasswordByUsername(String username, String password) {
        LambdaUpdateWrapper<UserDO> wrapper = new LambdaUpdateWrapper<>();
        wrapper.set(UserDO::getPassword, password);
        wrapper.set(UserDO::getUpdateTime, LocalDateTime.now());
        wrapper.eq(UserDO::getUsername, username);

        return update(null, wrapper);
    }
}
