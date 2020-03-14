package com.cts.emart.service;

import java.util.Optional;

import com.cts.emart.entity.Category;


public interface CategoryService {


	Category findBycategoryName(String categoryName);

	Optional<Category> getBycategoryName(String categoryName);



}
