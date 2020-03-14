package com.cts.emart.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.emart.entity.Login;
import com.cts.emart.model.Register;
import com.cts.emart.repository.LoginRepository;

@RestController
@RequestMapping("/users")
public class LoginController {
	@Autowired
	private LoginRepository loginRepo;

	@GetMapping("/{id}")
	public ResponseEntity<Login> getContactById(@PathVariable(name = "id") int userId) {
		ResponseEntity<Login> result;
		Login entity = loginRepo.findById(userId).orElse(null);
		if (null != entity) {
			ResponseEntity<Register> response = new RestTemplate().getForEntity("http://localhost:9100/users/{id}",
			Register.class, Collections.singletonMap("id", entity.getUserId()));
			Login model = new Login(entity, response.getBody());
			result = new ResponseEntity<Login>(model, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Login>(HttpStatus.NOT_FOUND);
		}
		return result;
	}

}
