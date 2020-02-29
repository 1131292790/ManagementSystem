package com.fuchuang.service.impl;

import com.fuchuang.dao.AdminDao;
import com.fuchuang.domain.Admin;
import com.fuchuang.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    /**
     * 登录
     * @param id
     * @param password
     * @return
     */
    @Override
    public Admin getAdminbyIdPwd(String id, String password) {
        return adminDao.getAdminbyIdPwd(id,password);
    }

    /**
     * 查询用户
     * @param
     * @return
     */
    @Override
    public Admin getAdminbyId(String id) {
        return adminDao.getAdminbyId(id);
    }

    /**
     * 修改密码
     * @param newpass 新密码
     * @return
     */
    @Override
    public boolean modAdmin(String newpass) {
        return adminDao.modAdmin(newpass);
    }


}
