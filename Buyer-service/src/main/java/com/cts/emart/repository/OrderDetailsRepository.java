package com.cts.emart.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.entity.OrderDetails;


public interface OrderDetailsRepository extends CrudRepository<OrderDetails,Integer> {
	Optional<OrderDetails> findById(int id);

}
