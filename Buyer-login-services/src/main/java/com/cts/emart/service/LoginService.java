package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import com.cts.emart.entity.Login;

public interface LoginService {
	
	Login findById(Integer userId);
	List<Login> getAllUsers();
	void addUser(Login user);
	Optional<Login> getUserByID(int id);
	void updateUser(Login user);
	void deleteUser(int id);
}
