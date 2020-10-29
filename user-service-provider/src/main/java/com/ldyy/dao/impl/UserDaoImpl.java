package com.ldyy.dao.impl;

import com.ldyy.dao.UserDao;
import com.ldyy.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<User> list = new ArrayList<User>();
    public List<User> findAll() {
        User user01 = new User("dubbo01", "蔷薇", 23);
        User user02 = new User("dubbo02", "永强", 43);
        list.add(user01);
        list.add(user02);
        return list;
    }

    public User findUserById(String id) {
        for (User user : list) {
            if (user.getUuid().equals(id)){
                return user;
            }
        }
        return null;
    }
}
