package com.cts.emart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.OrderDetails;

import com.cts.emart.repository.OrderDetailsRepository;

@Service
public class OrderDetailsService {
	@Autowired
	OrderDetailsRepository repo;
	public List<OrderDetails> getAllDetails() {
		// TODO Auto-generated method stub
		return (List<OrderDetails>) repo.findAll();
	}
	public OrderDetails findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
