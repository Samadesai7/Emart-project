package com.cts.emart.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.Payment;
@Repository
public interface PaymentRepository extends CrudRepository<Payment,Integer>{
	Optional<Payment> findById(int payId);


}
