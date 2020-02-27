package com.fuchuang.dao.auth;

import com.fuchuang.domain.adv.Notify;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotifyDao {

    /**
     * 查询通知
     * @param id
     * @return
     */
    Notify findById(int id);

    /**
     * 删除通知
     * @param id
     * @return
     */
    Notify delById(int id);

    /**
     * 新建通知
     * @param notify
     * @return
     */
    Notify createNotify(Notify notify);

    /**
     * 查找用户所有通知
     * @param uid
     * @return
     */
    List<Notify> findAllByUid(String uid);

    /**
     * 查询所有通知
     * @return
     */
    List<Notify> findAll();

    /**
     * 修改通知
     * @param notify
     * @return
     */
    Notify updateNotify(Notify notify);

}
