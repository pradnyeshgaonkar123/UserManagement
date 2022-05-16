package com.usermanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.entity.User;
import com.usermanagement.service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	@RequestMapping(value = "/save-user", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		return userServiceImpl.saveUser(user);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userServiceImpl.getUsers();
	}
	
}
