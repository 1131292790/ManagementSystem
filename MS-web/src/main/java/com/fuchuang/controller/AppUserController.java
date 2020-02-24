package com.fuchuang.controller;

import com.fuchuang.domain.auth.AppUser;
import com.fuchuang.service.auth.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/appuser")
@SessionAttributes("u_info")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;


}
