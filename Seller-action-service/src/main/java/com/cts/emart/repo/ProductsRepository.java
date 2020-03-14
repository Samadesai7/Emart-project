package com.cts.emart.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.ProductsEntity;
import com.cts.emart.model.Products;
@Repository
public interface ProductsRepository extends CrudRepository<ProductsEntity, Integer> {

	Optional<Products> findByProductName(String productName);
}
