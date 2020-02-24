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
    public AppUser findUserbyId(String id) {
        return appUserDao.findUserbyId(id);
    }

    @Override
    public boolean delUserbyId(String  id) {
        return appUserDao.delUserbyId(id);
    }

    @Override
    public boolean addUser(AppUser user) {
        return appUserDao.addUser(user);
    }

    @Override
    public boolean updateUserInfo(AppUser user) {
        return appUserDao.updateUserInfo(user);
    }

    @Override
    public boolean changePasswordById(String userId) {
        return appUserDao.changePasswordById(userId);
    }
}
