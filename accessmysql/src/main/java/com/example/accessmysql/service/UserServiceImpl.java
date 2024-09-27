package com.example.accessmysql.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessmysql.dao.UserRepository;
import com.example.accessmysql.model.User;

@Service  // a type of @component annotation
public class  UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }
    @Override
    public List<User> getAllUsers() {
        return new ArrayList<User>((Collection<? extends User>) userRepository.findAll());
    }
    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }	
}