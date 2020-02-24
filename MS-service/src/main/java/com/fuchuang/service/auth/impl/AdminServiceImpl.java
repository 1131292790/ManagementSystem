package com.fuchuang.service.auth.impl;

import com.fuchuang.dao.auth.AdminDao;
import com.fuchuang.domain.auth.Admin;
import com.fuchuang.service.auth.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin getAdminbyIdPwd(String id, String password) {
        return adminDao.getAdminbyIdPwd(id,password);
    }
}
