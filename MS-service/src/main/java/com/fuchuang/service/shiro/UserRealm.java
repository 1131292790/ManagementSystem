package com.fuchuang.service.shiro;

import com.fuchuang.domain.auth.Admin;
import com.fuchuang.service.auth.AdminService;
import com.fuchuang.service.auth.impl.AdminServiceImpl;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


class UserRealm extends AuthorizingRealm {


    @Autowired
    private AdminService adminServiceImpl;
    /**
     * 授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 登录
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取输入的账号
        String username = (String) authenticationToken.getPrincipal();
        //获取数据库的账号
        Admin admin = adminServiceImpl.getAdminbyId(username);
        //账号不存在
        if(admin==null){
            return null;
        }
        return new SimpleAuthenticationInfo(admin,admin.getPassWord(), getName());
    }
}