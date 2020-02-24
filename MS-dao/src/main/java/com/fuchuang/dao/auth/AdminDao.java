package com.fuchuang.dao.auth;

import com.fuchuang.domain.auth.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdminDao {

    @Select("select * from admin where adminId=#{adminId} and passWord=#{passWord}")
    Admin getAdminbyIdPwd(@Param("adminId")String id,@Param("passWord") String pwd);
}
