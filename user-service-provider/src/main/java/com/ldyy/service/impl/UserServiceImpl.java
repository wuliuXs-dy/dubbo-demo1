package com.ldyy.service.impl;

import com.ldyy.dao.UserDao;
import com.ldyy.dao.impl.UserDaoImpl;
import com.ldyy.domain.User;
import com.ldyy.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findUserById(String id) {
        return userDao.findUserById(id);
    }
}
