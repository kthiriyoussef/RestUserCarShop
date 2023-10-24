package com.youssef.users.service;

import java.util.List;

import com.youssef.users.entities.Role;
import com.youssef.users.entities.User;

public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);

	List<User> findAllUsers();
	
	User findUserByEmail(String email);
	
	boolean hasUserWithEmail(String email);

	
}