package com.fuchuang.controller;

import com.fuchuang.service.auth.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/appuser")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @RequestMapping("/test")
    public String test(){
        System.out.println("hello");
        return "test";
    }

}
