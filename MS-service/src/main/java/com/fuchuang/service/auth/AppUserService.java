package com.fuchuang.service.auth;

import com.fuchuang.domain.auth.AppUser;

public interface AppUserService {

    /**
     * 查询用户
     * @param id
     * @return
     */
    AppUser findUserbyId(String id);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean delUserbyId(String  id);

    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(AppUser user);

    /**
     * 修改用户个人信息
     * @param user
     * @return
     */
    boolean updateUserInfo(AppUser user);

    /**
     * 更改密码
     * @param userId
     * @return
     */
    boolean changePasswordById(String userId);


}
