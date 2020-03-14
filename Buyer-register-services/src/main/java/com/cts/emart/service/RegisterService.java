package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import com.cts.emart.entity.Register;

public interface RegisterService {
	
	Register findById(Integer userId);
	List<Register> getAllUsers();
	void addUser(Register user);
	Optional<Register> getUserByID(int id);
	//void updateUser(Register user);
	//void deleteUser(int id);
}
