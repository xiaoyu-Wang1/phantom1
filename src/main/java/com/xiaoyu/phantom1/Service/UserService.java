package com.xiaoyu.phantom1.Service;

import com.github.pagehelper.PageInfo;
import com.xiaoyu.phantom1.model.UserDomain;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}