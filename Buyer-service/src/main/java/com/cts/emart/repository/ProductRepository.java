package com.cts.emart.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.cts.emart.entity.Products;

public interface ProductRepository extends CrudRepository<Products, String> {
	Optional<Products> findByproductName(String productName);

}
