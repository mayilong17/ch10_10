package com.cs.dao.impl;

import com.cs.basedao.baseDao;
import com.cs.dao.UserInfoDao;
import com.cs.entity.UserInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserInfoDaoImpl implements UserInfoDao {
    private JdbcTemplate template= baseDao.getTemplate();
    @Override
    public List<UserInfo> findByNewsInfoAll() {
        String sql = "select * from UserInfo";
        return template.query(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
    }

    @Override
    public UserInfo queryUsername(UserInfo user) {
        String sql = "select * from UserInfo where userName=? and userPass=?";
        Object[] obj={user.getUserName(),user.getUserPass()};
        List<UserInfo> query = template.query(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class), obj);
        if (query.isEmpty()){
            return null;
        }else {
            return query.get(0);
        }
    }

    @Override
    public UserInfo findByidUserInfo(UserInfo user) {
        String sql="select * from UserInfo where userID=?";
        Object[] obj={user.getUserID()};
        List<UserInfo> query = template.query(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class),obj);
        if (query.isEmpty()){
            return null;
        }else {
            return query.get(0);
        }
    }

    @Override
    public int updateUser(UserInfo us)  {
        String sql="update UserInfo set userName=?,userPass=?,sex=?,age=?,email=? where userID=?";
        Object obj[]={us.getUserName(),us.getUserPass(),us.getSex(),us.getAge(),us.getEmail(),us.getUserID()};
        int update = template.update(sql, obj);
        if (update>0){
            return update;
        }
        return 0;
    }

    @Override
    public int delUser(int id) throws Exception {
        String sql="delete from UserInfo where userID=?";
        Object obj[]={id};
        int update = template.update(sql, obj);
        return update;
    }

    @Override
    public int addUser(UserInfo us) {
        String sql="INSERT INTO UserInfo VALUES(NULL,?,?,?,?,?)";
        Object obj[]={us.getUserName(),us.getUserPass(),us.getSex(),us.getAge(),us.getEmail()};
        int update = template.update(sql, obj);
        return update;
    }

    @Override
    public List<UserInfo> findByUserInfoPage(int page, int size) {
        String sql="select * from UserInfo Limit ?,?";
        Object[] obj={page,size};
        List<UserInfo> query = template.query(sql, new BeanPropertyRowMapper<>(UserInfo.class), obj);
        return query;
    }

    @Override
    public int queryCount() {
        String sql="select count(userID) from UserInfo";
        int i = template.queryForObject(sql, Integer.class);
        return i;
    }


}
