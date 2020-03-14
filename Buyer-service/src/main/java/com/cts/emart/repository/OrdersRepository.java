package com.cts.emart.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.entity.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {

	Optional<Orders> findById(int orderId);

	Iterable<Orders> findAll();

}
