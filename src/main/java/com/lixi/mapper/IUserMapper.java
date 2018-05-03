package com.lixi.mapper;

import com.lixi.entity.User;

import java.util.List;

public interface IUserMapper {

    public User findUserById(int id);

    public List<User> fingUserByName(String name);
}
