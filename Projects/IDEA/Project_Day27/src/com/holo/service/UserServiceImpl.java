package com.holo.service;

import com.holo.dao.BaseDaoImpl;
import com.holo.dao.User;
import com.holo.utils.BaseUtils;

import java.util.List;

/**
 * @author Holo
 * @date 2022/2/24 17:38
 */
public class UserServiceImpl implements UserService {
    private BaseDaoImpl<User> dao = new BaseDaoImpl<>();
    private String table = "files/students/";

    @Override
    public void saveUser(User user) {
        user.setId((int) BaseUtils.getKey());
        try {
            dao.save(user, table + BaseUtils.getFilename());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> show() {
        return dao.findAll(User.class, table);
    }

    @Override
    public void deleteUser(User user) {
        try {
            dao.delete(user, table );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            dao.update(user, table);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}