package com.cts.emart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.OrdersEntity;
import com.cts.emart.model.Orders;
import com.cts.emart.repo.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	public OrdersRepository rep;
	
	@Override
	public Iterable<OrdersEntity> findAll() {
		return rep.findAll();
	}

	@Override
	public Optional<Orders> findAllById(int orderId) {
		return rep.findById(orderId);
	}

	@Override
	public Orders findById(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
