package com.cs.dao;

import com.cs.entity.UserInfo;

import java.util.List;

public interface UserInfoDao {
    //查询所有
    public List<UserInfo> findByNewsInfoAll();
    //根据用户名密码查询；
    public UserInfo queryUsername(UserInfo user);
    //根据Id查看用户信息
    public UserInfo findByidUserInfo(UserInfo user);
    //根据Id修改用户信息
    public int updateUser(UserInfo us) throws Exception;
    //根据Id删除用户信息
    public int delUser(int id) throws Exception;
    //添加用户
    public int addUser(UserInfo userInfo);
    //分页
    public List<UserInfo> findByUserInfoPage(int page, int size);
    //查询总记录数
    public int queryCount();
}
