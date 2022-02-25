package com.holo.service;

import com.holo.dao.User;

import java.util.List;

/**
 * @author Holo
 * @date 2022/2/24 17:37
 */
public interface UserService {

    void saveUser(User user);

    List<User> show();

    void deleteUser(User user);

    void updateUser(User user);

}