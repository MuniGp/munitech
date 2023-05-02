package com.muni.springframeworkdemo.service;

import java.util.List;

import com.muni.springframeworkdemo.entity.User;

public interface UserService {
	List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
    
   // public List<User> search(String query) ;
}

