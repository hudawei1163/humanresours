package com.iotek.service;

import com.iotek.model.User;


/**
 * Created by lenovo on 2018/10/19.
 */
public interface UserService {
    boolean addUser(User user);
    boolean updateUser(User user);
    User queryUserByNameAndPass(User user);
    User queryUserByName(String u_name);
}
