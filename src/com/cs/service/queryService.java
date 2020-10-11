package com.cs.service;

import com.cs.entity.UserInfo;

import java.util.List;

public interface queryService {
    //查询所有用户信息
    public List<UserInfo> findbyAllInfo()throws Exception;

    //根据Id查看用户信息
    public UserInfo findByidUserInfoService(int id);

    //分页查询
    public List<UserInfo> findbyServicepage(int page, int size);

    //总记录数
    public int queryServiceCount();

    //总页数
    public int queryServicepageCount(int size);
}
