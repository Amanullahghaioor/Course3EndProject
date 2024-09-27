package com.example.accessmysql.service;

import java.util.List;
import java.util.Optional;

import com.example.accessmysql.model.User;

public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(Integer id);
    List<User> getAllUsers();
    void deleteUser(Integer id);
}
