package com.hdy.weblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Hao-ZY
 * @Date: 2025/4/10 10:22
 **/
@Data
@Builder
@TableName("t_user_role")
public class UserRoleDO {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String username;
    private String role;
    private Date createTime;
}
