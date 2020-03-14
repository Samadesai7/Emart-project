package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.Register;
import com.cts.emart.repo.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	public RegisterRepository logRep;

	@Override
	public Register findById(Integer userId) {
		return logRep.findById(userId).orElse(null);
	}

	@Override
	public List<Register> getAllUsers() {

//		Get all the users with their details from the db
		return (List<Register>) logRep.findAll();

	}
	
	public void addUser(Register user) {
		logRep.save(user);
		
	}

	public Optional<Register> getUserDetailsByID(int id) {
		
		return logRep.findById(id);
	}

	@Override
	public Optional<Register> getUserByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*public void deleteUser(int id) {
		logRep.deleteById(id);
		
	}*/

	/*@Override
	public Optional<Register> getUserByID(int userId) {
		// TODO Auto-generated method stub
		return logRep.findById(userId);
	}*/

	/*@Override
	public void updateUser(Register user) {
		// TODO Auto-generated method stub
		logRep.save(user);
	}*/

}
