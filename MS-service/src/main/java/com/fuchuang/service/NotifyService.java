package com.fuchuang.service;
import com.fuchuang.domain.Notify;
import java.util.List;

public interface NotifyService {


    /**
     * 查询所有通知
     * @return
     */
    List<Notify> findAll();

    /**
     * 发送通知
     * @param notify
     * @return
     */
    boolean sendNofitication(Notify notify);



}
