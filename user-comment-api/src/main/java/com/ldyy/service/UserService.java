package com.ldyy.service;

import com.ldyy.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findUserById(String id);
}
