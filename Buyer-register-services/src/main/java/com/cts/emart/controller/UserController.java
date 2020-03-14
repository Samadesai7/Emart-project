package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.entity.Register;
import com.cts.emart.service.RegisterService;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	public RegisterService service;
	
	
	@RequestMapping("/users")
	List<Register> getAllUsers() {
		return service.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody Register user) {
		service.addUser(user);
	}

	@RequestMapping("/users/{id}")
	Optional<Register> getUserByID(@PathVariable int id) {
		return service.getUserByID(id);
	}
	
	/*@RequestMapping(method = RequestMethod.PUT, value = "/users/")
	void updateUser(@RequestBody Register user) {
		service.updateUser(user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}*/
	
}
