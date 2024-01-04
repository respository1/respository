package com.hzblogs.service.admin;

import com.hzblogs.bean.Admin;
import com.hzblogs.dao.AdminMapper;
import com.hzblogs.tool.Constants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


/**
 * @author cc
 * @date 2021/6/23
 */
@Component("AdminServiceImpl")
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    @Override
    @Transactional// 开启事务管理
    public Admin adminLogin(Admin admin) {
        //数据效验
        if(admin == null){
            return null;
        }
        try {
            admin.setAdminPassword(Constants.EncodeByMd5(admin.getAdminPassword()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Admin dbAdmin = adminMapper.selectByNameAndPassword(admin);
        if (dbAdmin != null &&
                StringUtils.equals(admin.getAdminPassword(),dbAdmin.getAdminPassword())) {

            return dbAdmin;
        }
        return null;
    }

    @Override
    public Admin selectAdminById(int loginAdminId) {

        return adminMapper.selectByPrimaryKey(loginAdminId);
    }
}
