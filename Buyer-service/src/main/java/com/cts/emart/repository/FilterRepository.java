package com.cts.emart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.Products;
@Repository
public interface FilterRepository extends CrudRepository<Products, Integer> {
	@Query(value = "SELECT * FROM PRODUCTS p WHERE p.price>=:startPrice", nativeQuery = true)
	List<Products> findAllByStartPrice(double startPrice);

	@Query(value = "SELECT * FROM PRODUCTS p WHERE p.price<=:endPrice", nativeQuery = true)
	List<Products> findAllByEndPrice(double endPrice);

	@Query(value = "SELECT * FROM PRODUCTS p WHERE p.price BETWEEN :startPrice AND :endPrice", nativeQuery = true)
	List<Products> findAllByPrice(double startPrice, double endPrice);


}
