package com.cs.service.impl;

import com.cs.dao.impl.UserInfoDaoImpl;
import com.cs.entity.UserInfo;
import com.cs.service.addService;

public class addServiceImpl implements addService {
    @Override
    public boolean addUserService(UserInfo userInfo) {
        int i = new UserInfoDaoImpl().addUser(userInfo);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
}
