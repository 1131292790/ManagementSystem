package com.fuchuang.dao.auth;

import com.fuchuang.domain.auth.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {


    /**
     * 账号密码查询管理员
     * @param id
     * @param pwd
     * @return
     */
    @Select("select * from admin where adminId=#{adminId} and passWord=#{passWord}")
    Admin getAdminbyIdPwd(@Param("adminId")String id,@Param("passWord") String pwd);

    /**
     * 获取id是否存在，封装部分信息
     * @param id
     * @return
     */
    @Select("select adminId from admin where adminId=#{adminId}")
    Admin getAdminbyId(@Param("adminId")String id);

    /**
     * 修改管理员密码
     * @param passWord 新密码
     * @return
     */
    @Update("update admin set passWord=#{passWord}")
    boolean modAdmin(String passWord);

}
