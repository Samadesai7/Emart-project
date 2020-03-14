package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.Login;
import com.cts.emart.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	public LoginRepository logRep;

	@Override
	public Login findById(Integer userId) {
		return logRep.findById(userId).orElse(null);
	}

	@Override
	public List<Login> getAllUsers() {

//		Get all the users with their details from the db
		return (List<Login>) logRep.findAll();

	}
	
	public void addUser(Login user) {
		logRep.save(user);
		
	}

	public Optional<Login> getUserDetailsByID(int id) {
		
		return logRep.findById(id);
	}

	public void deleteUser(int id) {
		logRep.deleteById(id);
		
	}

	@Override
	public Optional<Login> getUserByID(int userId) {
		// TODO Auto-generated method stub
		return logRep.findById(userId);
	}

	@Override
	public void updateUser(Login user) {
		// TODO Auto-generated method stub
		logRep.save(user);
	}

}
