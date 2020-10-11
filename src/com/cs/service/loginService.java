package com.cs.service;

import com.cs.entity.UserInfo;

public interface loginService {
    //登录功能
    public UserInfo login(String username, String password)throws  Exception;
}
