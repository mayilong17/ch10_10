package com.cs.test;


import com.cs.dao.impl.UserInfoDaoImpl;
import com.cs.entity.UserInfo;
import com.cs.service.impl.addServiceImpl;
import com.cs.service.impl.delServiceImpl;
import com.cs.service.impl.queryServiceImpl;
import com.cs.service.impl.updateServiceImpl;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public  void testUserInfo() {
        List<UserInfo> list = new UserInfoDaoImpl().findByNewsInfoAll();
        for (UserInfo u:list) {
            System.out.println(u.toString());
        }
    }

    @Test
    public void testQueryUsername(){
        UserInfo user = new UserInfo();
        user.setUserName("acb");
        user.setUserPass("111113");
        UserInfo userInfo = new UserInfoDaoImpl().queryUsername(user);
        System.out.println(userInfo);
    }
    @Test
    public void testfindByidUserInfoService(){
        UserInfo byidUserInfoService = new queryServiceImpl().findByidUserInfoService(1);
        System.out.println(byidUserInfoService);
    }
    @Test
    public void testupdateUser(){
        UserInfo us = new UserInfo(1,"马一龙","123456","男",20,"2229297547@qq.com");
        try {
            boolean b = new updateServiceImpl().updateUser(us);
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testdelUser(){
        try {
            boolean b = new delServiceImpl().delUser(4);
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testadd(){
        UserInfo us = new UserInfo(1,"jim","123456","男",20,"2229297547@qq.com");
        boolean b = new addServiceImpl().addUserService(us);
        System.out.println(b);
    }
    @Test
    public void testpage(){
        List<UserInfo> list = new UserInfoDaoImpl().findByUserInfoPage(0, 3);
        for (UserInfo us:list) {
            System.out.println(us.toString());
        }
    }
    @Test
    public void testcount(){
        int i = new UserInfoDaoImpl().queryCount();
        System.out.println(i);
    }
}
