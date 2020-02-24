package com.fuchuang.service.auth;

import com.fuchuang.domain.auth.Admin;

public interface AdminService {

    Admin getAdminbyIdPwd(String id,String password);
}
