package com.hdy.weblog.jwt.service;

import com.hdy.weblog.common.domain.dos.UserDO;
import com.hdy.weblog.common.domain.dos.UserRoleDO;
import com.hdy.weblog.common.domain.mapper.UserMapper;
import com.hdy.weblog.common.domain.mapper.UserRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author: Hao-ZY
 * @Date: 2025/3/26 15:21
 **/
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 从数据库中查询
        UserDO userDO = userMapper.findByUsername(username);

        // 判断用户是否存在
        if (Objects.isNull(userDO)) {
            throw new UsernameNotFoundException("该用户不存在");
        }

        List<UserRoleDO> roleDOS = userRoleMapper.selectByUsername(username);
        String roleArr[] = null;

        if (!CollectionUtils.isEmpty(roleDOS)) {
            List<String> roles = roleDOS.stream()
                    .map(p -> p.getRole())
                    .collect(Collectors.toList());
            roleArr = roles.toArray(new String[roles.size()]);
        }

        // 检查角色列表是否为空
//        if (!CollectionUtils.isEmpty(roleDOS)) {
//            // 提取角色名称并转换为数组
//            roleArr = roleDOS.stream()
//                    .map(UserRoleDO::getRole)
//                    .filter(Objects::nonNull) // 过滤掉空值
//                    .toArray(String[]::new); // 直接生成数组
//        }

        // authorities 用于指定角色，这里写死为 ADMIN 管理员
        return User.withUsername(userDO.getUsername())
                .password(userDO.getPassword())
                .authorities(roleArr)
                .build();
    }
}
