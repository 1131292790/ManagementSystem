package com.fuchuang.controller;

import com.fuchuang.domain.Admin;
import com.fuchuang.service.AdminService;
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
    @ResponseBody
    public Map<String, Object> adminLogin(@RequestBody Admin loginadmin, HttpServletRequest request){

        Map<String,Object> map = new HashMap<>();
        Admin admin = adminServiceImpl.getAdminbyIdPwd(loginadmin.getAdminId(),loginadmin.getPassWord());
        if(admin!=null){
            request.getSession().setAttribute("admin",admin);
            map.put("success","success");
            return map;
        }
        map.put("success","fail");
        return map;
    }

    /**
     * 退出登录
     * @param request
     * @return
     */
    @RequestMapping(value = "/adminlogout",method = RequestMethod.GET)
    public String adminLogout(HttpServletRequest request){
        request.getSession().removeAttribute("admin");
        return "redirect:/login.jsp";
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


    //***********************页面跳转相关****************************************/

    /**
     * 进入管理员首页
     * @return
     */
    @RequestMapping("/index")
    String toIndex(){
        return "admin/admin_home";
    }


    /**
     * 返回登录页面
     * @return
     */
    @RequestMapping("/login")
    String toLogin(){
        return "redirect:/login.jsp";
    }
}
