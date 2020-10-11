package com.cs.service;

import com.cs.entity.UserInfo;

public interface updateService {
    //根据Id修改用户信息
    public boolean updateUser(UserInfo us) throws Exception;
}
