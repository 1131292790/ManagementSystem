package com.fuchuang.service.users;

import com.fuchuang.domain.users.AppUser;
public interface AppUserService {

    /**
     * 注册
     * @param appUser
     * @return
     */
    boolean doRegister(AppUser appUser);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    AppUser doLogin(String username,String password);


    /**
     * 修改信息
     * @param user
     * @return
     */
    boolean modUser(AppUser user);

    /**
     * 修改密码
     * @param pwd
     * @return
     */
    boolean changePwd(String userid,String pwd);

    /**
     * 获取用户信息
     * @param userid
     * @return
     */
    AppUser getUserInfo(String userid);

    //TODO 查询购买记录


}
