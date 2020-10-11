package com.cs.service.impl;


import com.cs.dao.impl.UserInfoDaoImpl;
import com.cs.entity.UserInfo;
import com.cs.service.loginService;

public class loginServiceImpl implements loginService {
    private UserInfoDaoImpl userInfoDaoimpl=new UserInfoDaoImpl();
    @Override
    public UserInfo login(String username, String password) throws Exception {
        UserInfo user = new UserInfo();
        user.setUserName(username);
        user.setUserPass(password);
        return userInfoDaoimpl.queryUsername(user);
    }
}
