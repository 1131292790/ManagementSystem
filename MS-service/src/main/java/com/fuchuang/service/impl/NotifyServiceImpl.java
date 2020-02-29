package com.fuchuang.service.impl;

import com.fuchuang.dao.NotifyDao;
import com.fuchuang.dao.AppUserDao;
import com.fuchuang.domain.Notify;
import com.fuchuang.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NotifyServlet")
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private NotifyDao notifyDao;
    @Autowired
    private AppUserDao appUserDao;

    /**
     * 查询系统所有的通知
     * @return
     */
    @Override
    public List<Notify> findAll() {
        return notifyDao.findAll();
    }

    @Override
    public boolean sendNofitication(Notify notify) {
        return false;
    }


}
