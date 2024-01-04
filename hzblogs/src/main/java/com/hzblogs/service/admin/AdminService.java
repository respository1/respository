package com.hzblogs.service.admin;

import com.hzblogs.bean.Admin;

/**
 * @author cc
 */
public interface AdminService {
    /**
     *  判断管理员登录
     */
    Admin adminLogin(Admin recode);

    Admin selectAdminById(int loginAdminId);
}
