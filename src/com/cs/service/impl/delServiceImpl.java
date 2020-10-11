package com.cs.service.impl;


import com.cs.dao.impl.UserInfoDaoImpl;
import com.cs.service.delService;

public class delServiceImpl implements delService {
    @Override
    public boolean delUser(int id) throws Exception {
        int i = new UserInfoDaoImpl().delUser(id);
        if (i>0){
            return true;
        }else{
            return false;
        }
    }
}
