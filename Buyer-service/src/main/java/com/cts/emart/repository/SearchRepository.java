package com.cts.emart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.Products;

@Repository
public interface SearchRepository extends CrudRepository<Products, Integer> {
	Products findByProductName(String productName);

	@Query(value = "SELECT * FROM Products p WHERE p.c_id IN(SELECT c_id FROM Categories c WHERE c.cName=:categoryName)", nativeQuery = true)
	List<Products> findAllByCategory(String categoryName);

	@Query(value = "SELECT * FROM Products p WHERE p.s_id IN(SELECT s_id FROM Sub_Categories c WHERE c.sName=:subCategoryName)", nativeQuery = true)
	List<Products> findAllBySubCategory(String subCategoryName);


}
