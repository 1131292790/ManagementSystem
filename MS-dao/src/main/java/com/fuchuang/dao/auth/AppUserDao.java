package com.fuchuang.dao.auth;

import com.fuchuang.domain.auth.AppUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserDao {

    /**
     * 查询用户
     * @param id
     * @return
     */
    @Select("select * from appuser where userId=#{id}")
    AppUser findUserbyId(String id);

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Select("delete from appuser where userId=#{id}")
    boolean delUserbyId(String id);

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Insert("insert into appuser values(#{userId},#{nickName},#{phoneNum},#{imgUrl},#{cityName},#{passWord},#{carbonCoin})")
    boolean addUser(AppUser user);

    /**
     * 修改用户个人信息
     * @param user
     * @return
     */
    @Update("update appuser set nickName=#{nickName},imgUrl=#{imgUrl}")
    boolean updateUserInfo(AppUser user);

    /**
     * 更改密码
     * @param userId
     * @return
     */
    @Update("update appuser set passWord=#{passWord} where userId={userId}")
    boolean changePasswordById(String userId);


}
