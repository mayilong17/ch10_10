package com.cs.service.impl;

import com.cs.dao.impl.UserInfoDaoImpl;
import com.cs.entity.UserInfo;
import com.cs.service.updateService;

public class updateServiceImpl implements updateService {
    private UserInfoDaoImpl userInfoDaoimpl=new UserInfoDaoImpl();
    @Override
    public boolean updateUser(UserInfo us){
        int i = userInfoDaoimpl.updateUser(us);
        if (i>0){
            return true;
        }else{
            return false;
        }
    }
}
