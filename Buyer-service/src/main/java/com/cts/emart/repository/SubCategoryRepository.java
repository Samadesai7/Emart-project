package com.cts.emart.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cts.emart.entity.SubCategory;

@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategory, String> {


	Optional<SubCategory> findBySubCategoryName(String subCategoryName);

	
	

}
