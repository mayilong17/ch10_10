package com.cs.service.impl;


import com.cs.dao.impl.UserInfoDaoImpl;
import com.cs.entity.UserInfo;
import com.cs.service.queryService;

import java.util.List;

public class queryServiceImpl implements queryService {
    private UserInfoDaoImpl userInfoDaoimpl=new UserInfoDaoImpl();
    @Override
    public List<UserInfo> findbyAllInfo() throws Exception {
        return userInfoDaoimpl.findByNewsInfoAll();
    }

    @Override
    public UserInfo findByidUserInfoService(int id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(id);
        return userInfoDaoimpl.findByidUserInfo(userInfo);
    }

    @Override
    public List<UserInfo> findbyServicepage(int page, int size) {
        List<UserInfo> list = new UserInfoDaoImpl().findByUserInfoPage((page - 1)*size, size);
        return list;
    }

    @Override
    public int queryServiceCount() {
        return new UserInfoDaoImpl().queryCount();
    }

    @Override
    public int queryServicepageCount(int size) {
        if (queryServiceCount()%size==0){
            return queryServiceCount()/size;
        }else {
            return queryServiceCount()/size+1;
        }
    }

}
