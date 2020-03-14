package com.cts.emart.service;

import java.util.Optional;

import com.cts.emart.entity.SubCategoryEntity;
import com.cts.emart.model.SubCategory;

public interface SubCategoryService {
	Optional<SubCategory> findBySubCategoryName(String subCategoryName);

	void addSubCategories(SubCategoryEntity subc);

	void updateSubCategories(SubCategoryEntity subc);
}
