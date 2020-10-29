package com.ldyy.dao;

import com.ldyy.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findUserById(String id);
}
