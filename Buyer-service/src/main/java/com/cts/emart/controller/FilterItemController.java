package com.cts.emart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.entity.Products;
import com.cts.emart.service.FilterItemService;




@RestController
@CrossOrigin
@RequestMapping("/filter")
public class FilterItemController {
	
	@Autowired
	FilterItemService service;
	
	@RequestMapping("/products/{startPrice}")
	List<Products> filterByStartPrice(@PathVariable double startPrice){
		return (List<Products>)service.filterByStartPrice(startPrice);
	}
	
	@RequestMapping("/product/{endPrice}")
	List<Products> filterByEndPrice(@PathVariable double endPrice){
		return (List<Products>)service.filterByEndPrice(endPrice);
	}
	
	@RequestMapping("/products/{startPrice}/{endPrice}")
	List<Products> filterByPrice(@PathVariable double startPrice, @PathVariable double endPrice){
		return (List<Products>)service.filterByPrice(startPrice,endPrice);
	}
}
