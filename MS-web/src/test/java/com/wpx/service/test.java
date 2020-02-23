package com.wpx.service;

import com.wpx.domain.Model;
import com.wpx.service.impl.ModelServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class test {

    @Autowired
    private ModelService modelService;

    @Test
    public void testOutprint(){
        Model o = modelService.Outprint(1);
        System.out.println(o);
    }

}
