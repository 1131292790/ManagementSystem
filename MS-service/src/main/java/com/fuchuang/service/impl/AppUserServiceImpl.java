package com.fuchuang.service.impl;

import com.fuchuang.dao.AppUserDao;
import com.fuchuang.domain.AppUser;
import com.fuchuang.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AppUserService")
public class AppUserServiceImpl implements AppUserService {
    @Autowired
    private AppUserDao appUserDao;

    /**
     * 注册
     * @param appUser
     * @return
     */
    @Override
    public boolean doRegister(AppUser appUser) {
        AppUser checkuser = appUserDao.findUserbyId(appUser.getUserId());
        //用户名不冲突
        if(checkuser!=null){
            appUserDao.addUser(appUser);
            return true;
        }
        return false;
    }

    /**
     * 登录
     * @return
     */
    @Override
    public AppUser doLogin(String username,String password) {
        AppUser user = appUserDao.findUserbyIdPwd(username, password);
        return user;
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @Override
    public boolean modUser(AppUser user) {
        return appUserDao.updateUserInfo(user);
    }

    /**
     * 修改密码
     * @param pwd
     * @return
     */
    @Override
    public boolean changePwd(String userid,String pwd) {
        return appUserDao.changePasswordById(userid,pwd);
    }

    /**
     * 查询用户信息
     * @param userid
     * @return
     */
    @Override
    public AppUser getUserInfo(String userid) {
        return appUserDao.findUserbyId(userid);
    }
}
