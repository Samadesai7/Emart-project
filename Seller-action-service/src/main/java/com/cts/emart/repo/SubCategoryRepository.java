package com.cts.emart.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.SubCategoryEntity;
import com.cts.emart.model.SubCategory;
@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategoryEntity, Integer> {
	Optional<SubCategory> findBySubCategoryName(String subCategoryName);
}
