package com.cts.emart.service;

import java.util.Optional;

import com.cts.emart.entity.OrdersEntity;
import com.cts.emart.model.Orders;

public interface OrdersService {
	Optional<Orders> findAllById(int orderId);

	Orders findById(int orderId);
	Iterable<OrdersEntity> findAll();
}
