package com.iotek.service.impl;

import com.iotek.dao.UserDao;
import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/19.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    //增加用户
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }
    //修改用户信息
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }
    //通过用户名和密码查询用户
    public User queryUserByNameAndPass(User user) {

        return userDao.queryUserByNameAndPass(user);
    }

    @Override
    public User queryUserByName(String u_name) {
        return userDao.queryUserByName(u_name);
    }


}
