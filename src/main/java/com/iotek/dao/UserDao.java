package com.iotek.dao;

import com.iotek.model.User;

import java.util.List;

/**
 * Created by lenovo on 2018/10/19.
 */
public interface UserDao {
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
    User queryUserByNameAndPass(User user);
    List<User> queryAllUser();
    User queryUserById(int u_id);
    User queryUserByName(String u_name);
}
