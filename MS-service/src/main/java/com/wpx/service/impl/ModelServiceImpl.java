package com.wpx.service.impl;

import com.wpx.dao.ModelDao;
import com.wpx.domain.Model;
import com.wpx.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ModelService")
public class ModelServiceImpl implements ModelService {
    @Autowired
    private ModelDao modelDao;

    @Override
    public Model Outprint(int id) {
        return modelDao.Outprint(id);
    }
}
