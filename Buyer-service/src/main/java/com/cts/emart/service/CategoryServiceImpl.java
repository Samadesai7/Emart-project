package com.cts.emart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.Category;
import com.cts.emart.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	public CategoryRepository catRep;
    @Override
	public Category findBycategoryName(String categoryName) {
		return catRep.findBycategoryName(categoryName).orElse(null);
	}
	@Override
	public Optional<Category> getBycategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

}
