package com.cts.emart.service;


import java.util.Optional;

import com.cts.emart.entity.Orders;

public interface OrderService {
	Optional<Orders> findAllById(int orderId);

	Orders findById(int orderId);
	Iterable<Orders> findAll();
	
	

	


}
