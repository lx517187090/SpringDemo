package com.lixi.dao.impl;

import com.lixi.entity.User;

import java.util.List;

public interface IUserDao {

    public User findUserById(int id);

    public List<User> findUserByName(String name);
}
