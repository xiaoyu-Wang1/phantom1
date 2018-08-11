package com.xiaoyu.phantom1.dao;

import com.xiaoyu.phantom1.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}