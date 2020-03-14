package com.cts.emart.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.Products;
import com.cts.emart.repository.SearchRepository;

@Service
public class SearchItemService {

	@Autowired
	SearchRepository repo;

	public Optional<Products> searchById(Integer id) {
		return repo.findById(id);
	}

	public List<Products> getAllProducts() {
		return (List<Products>) repo.findAll();
	}

	public Products searchByName(String productName) {
		return (Products) repo.findByProductName(productName);
	}

	public List<Products> searchByCategory(String categoryName) {
		return (List<Products>) repo.findAllByCategory(categoryName);
	}

	public List<Products> searchBySubCategory(String subCategoryName) {
		return (List<Products>) repo.findAllBySubCategory(subCategoryName);
	}

}
