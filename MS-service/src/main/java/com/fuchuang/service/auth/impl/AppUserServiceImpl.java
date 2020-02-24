package com.fuchuang.service.auth.impl;

import com.fuchuang.domain.auth.AppUser;
import com.fuchuang.dao.auth.AppUserDao;
import com.fuchuang.service.auth.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AppUserService")
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserDao appUserDao;


    @Override
    public AppUser getUserbyId(String userId) {
        return appUserDao.findUserbyId(userId);
    }

    @Override
    public AppUser getUserbyIdPwd(String id, String pwd) {
        return appUserDao.findUserbyIdPwd(id,pwd);
    }

    @Override
    public boolean createUser(AppUser user) {
        return appUserDao.addUser(user);
    }

    @Override
    public boolean delUser(String userId) {
        return appUserDao.delUserbyId(userId);
    }

    @Override
    public boolean modInfobyUser(AppUser user) {
        return appUserDao.updateUserInfo(user);
    }


}
