package com.cts.emart.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.Category;
@Repository
public interface CategoryRepository extends  CrudRepository<Category, String> {
	Optional<Category> findBycategoryName(String categoryName);


	

}
