package com.hdy.weblog.admin.service;

import com.hdy.weblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.hdy.weblog.common.utils.Response;

/**
 * @Author: Hao-ZY
 * @Date: 2025/5/9 11:27
 **/
public interface AdminUserService {

    /**
     * 修改密码
     *
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);

    /**
     * 获取当前登录用户信息
     *
     * @return
     */
    Response findUserInfo();
}
