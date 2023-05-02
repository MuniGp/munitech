package com.muni.springframeworkdemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muni.springframeworkdemo.entity.User;
import com.muni.springframeworkdemo.repository.UserRepository;
import com.muni.springframeworkdemo.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	    private UserRepository userRepository;

	    @Override
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public User getUserById(Long id) {
	        return userRepository.findById(id).orElseThrow();
	    }
	    @Override
	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public User updateUser(Long id, User user) {
	        User existingUser = userRepository.findById(id).orElseThrow();
	        existingUser.setFirstName(user.getFirstName());
	        existingUser.setLastName(user.getLastName());
	        existingUser.setEmail(user.getEmail());
	        return userRepository.save(existingUser);
	    }

	    @Override
	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }

		/*
		 * public List<User> search(String query) { List<User> users =
		 * userRepository.findAll(); return users.stream() .filter(u ->
		 * u.getFirstName().contains(query) || u.getLastName().contains(query) ||
		 * u.getEmail().contains(query)) .collect(Collectors.toList()); }
		 */
		}
	
