package com.usermanagement.service;


import java.util.List;

import com.usermanagement.entity.User;

public interface UserService {

	User saveUser(User user);

	List<User> getUsers();

}
