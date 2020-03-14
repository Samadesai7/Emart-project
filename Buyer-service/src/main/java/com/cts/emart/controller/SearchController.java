package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.entity.Products;
import com.cts.emart.service.SearchItemService;

@RestController
@CrossOrigin
@RequestMapping("/search")

public class SearchController {
	@Autowired
	SearchItemService service;
	
	@RequestMapping("/products")
	List<Products> getAllProducts(){
		return service.getAllProducts();
	}
	
	@RequestMapping("/products/{id}")
	Optional<Products> searchById(@PathVariable Integer id){
		return service.searchById(id);
	}
	
	@RequestMapping("/product/products/{productName}")
	Products searchByName(@PathVariable String productName){
		return service.searchByName(productName);
	}

	@RequestMapping("/{categoryName}")
	List<Products> searchByCategory(@PathVariable String categoryName){
		return (List<Products>) service.searchByCategory(categoryName);
	}
	
	@RequestMapping("/category/{subCategoryName}")
	List<Products> searchBySubCategory(@PathVariable String subCategoryName){
		return (List<Products>) service.searchBySubCategory(subCategoryName);
	}
	


	

}
