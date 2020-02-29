package com.fuchuang.service;

import com.fuchuang.domain.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminService {

    /**
     * 登录
     * @param id
     * @param password
     * @return
     */
    Admin getAdminbyIdPwd(String id,String password);

    /**
     * 修改密码
     * @param newpass 新密码
     * @return
     */
    boolean modAdmin(String newpass);

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    Admin getAdminbyId(@Param("adminId")String id);

}
