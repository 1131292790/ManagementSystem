package com.fuchuang.service.auth;

import com.fuchuang.domain.auth.AppUser;
import org.apache.ibatis.annotations.Param;

public interface AppUserService {

    /**
     * 查询用户信息
     * @param userId 用户email/账号
     * @return
     */
    AppUser getUserbyId(String userId);

    /**
     * 登录验证
     * @param id
     * @param pwd
     * @return
     */

    AppUser getUserbyIdPwd(String id,String pwd);
    /**
     * 创建用户
     * @param user
     * @return
     */
    boolean createUser(AppUser user);

    /**
     * 删除账号
     * @param userId
     * @return
     */
    boolean delUser(String userId);

    /**
     * 用户修改个人信息
     * @param user
     * @return
     */
    boolean modInfobyUser(AppUser user);



}
