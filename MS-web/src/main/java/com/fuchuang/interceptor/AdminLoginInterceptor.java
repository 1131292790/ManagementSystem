package com.fuchuang.interceptor;

import com.fuchuang.domain.auth.Admin;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();
        //放行通过登录进入主页的请求和跳转登录的请求
        if(requestURI.contains("/admin/adminlogin")||requestURI.contains("/admin/login")){
            return true;
        }
        if(request.getSession().getAttribute("admin")!=null){
            return true;
        }
        //重定向到登录页面
        response.sendRedirect("/admin/login");
        return false;
    }
}
