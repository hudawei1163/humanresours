package com.iotek.service;

import com.iotek.dao.UserDao;
import com.iotek.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/19.
 */
public interface UserService {
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
    User queryUserByNameAndPass(User user);
    List<User> queryAllUser();
    User queryUserById(int u_id);
    User queryUserByName(String u_name);
}
