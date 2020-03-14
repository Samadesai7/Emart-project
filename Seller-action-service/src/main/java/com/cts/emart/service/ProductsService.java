package com.cts.emart.service;

import java.util.Optional;

import com.cts.emart.entity.ProductsEntity;
import com.cts.emart.model.Products;

public interface ProductsService {
	Optional<Products> findByProductName(String productName);

	void addProducts(ProductsEntity pro);
	Iterable<ProductsEntity> findAll2();

	
}
