package com.cts.emart.service;

import java.util.Optional;

import com.cts.emart.entity.CategoryEntity;
import com.cts.emart.model.Category;

public interface CategoryService {

	Optional<Category> findByCategoryName(String categoryName);

	void addCategories(CategoryEntity cat);

	void updateCategories(CategoryEntity cat);
	Iterable<CategoryEntity> findAll1();
	
}
