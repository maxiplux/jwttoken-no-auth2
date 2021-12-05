package com.example.jwttokennoauth2.services;

import com.example.jwttokennoauth2.models.User;
import com.example.jwttokennoauth2.dtos.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
