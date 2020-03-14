package com.cts.emart.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.OrdersEntity;
import com.cts.emart.model.Orders;
@Repository
public interface OrdersRepository extends CrudRepository<OrdersEntity, Integer> {

	Optional<Orders> findById(int orderId);
	
}
