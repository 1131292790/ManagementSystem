package com.fuchuang.dao;

import com.fuchuang.domain.Notify;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotifyDao {

    //**********************后台相关dao*************************************/
    
    /**
     * 查询通知
     * @param id
     * @return
     */
    @Select("select * from notify where notifyId = #{id}")
    Notify findById(String id);

    /**
     * 删除通知
     * @param id
     * @return
     */
    @Delete("delete from notify where notifyId=#{id}")
    Notify delById(String id);

    /**
     * 新建通知
     * @param notify
     * @return
     */
    @Insert("insert into notify values(#{notifyId},#{title},#{content},#{type},#{sendTime},#{fromAdmin})")
    Notify createNotify(Notify notify);

    /**
     * 查询所有通知
     * @return
     */
    @Select("select * from notify")
    List<Notify> findAll();



    /**********************用户相关dao*************************************/
    /**
     * 根据用户id查询所有的通知
     * @param userid
     * @return
     */
    @Select("SELECT t3.* FROM appuser t1 INNER JOIN\n" +
            "notifyuser t2 ON t2.`uId`=t1.`userId` INNER JOIN\n" +
            "notify t3 ON t2.`nId`=t3.`notifyId`")
    List<Notify> findAllByUserId(String userid);



}
