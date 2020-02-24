package com.fuchuang.controller;

import com.fuchuang.domain.auth.Admin;
import com.fuchuang.service.auth.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin_info")
public class AdminController {

    @Autowired
    private AdminService adminServiceImpl;

    /**
     *
     * @param username 表单参数,管理员账户
     * @param password 表单请求参数
     * @return
     */
    public String adminLogin(Model model, String username, String password){

        Admin admin = adminServiceImpl.getAdminbyIdPwd(username, password);
        if(admin!=null){
            model.addAttribute("admin_info",admin);
            return "admin_home";
        }
        return "redirect:index.html";
    }
}
