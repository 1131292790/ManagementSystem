package com.fuchuang.controller;

import com.fuchuang.domain.auth.Admin;
import com.fuchuang.service.auth.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin_info")
public class AdminController {

    @Autowired
    private AdminService adminServiceImpl;

    /**
     * 登录验证
     * @return
     */
    @RequestMapping(value = "/adminlogin",method = RequestMethod.POST)
    public String adminLogin(String username,String password, HttpServletRequest request){
        Admin admin = adminServiceImpl.getAdminbyIdPwd(username,password);
        if(admin!=null){
            request.getSession().setAttribute("admin",admin);
            return "redirect:/admin/admin_home.jsp";
        }
        return null;
    }

    /**
     * 退出登录
     * @param request
     * @return
     */
    @RequestMapping(value = "/adminlogout",method = RequestMethod.GET)
    public String adminLogout(HttpServletRequest request){
        request.getSession().removeAttribute("admin");
        return "redirect:login.jsp";
    }


    /**
     * 修改密码
     * @param request
     * @param newpass
     * @return
     */
    @RequestMapping("/changepass")
    @ResponseBody
    public String changePassword(HttpServletRequest request,@RequestParam(value = "newpass",required = true) String newpass){
        Admin admin =(Admin) request.getSession().getAttribute("admin");
        if(!newpass.equals(admin.getPassWord())){
            return "sucess";
        }
        return "fail";
    }

}
