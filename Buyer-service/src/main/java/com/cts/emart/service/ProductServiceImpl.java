package com.cts.emart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cts.emart.entity.Products;
import com.cts.emart.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
   @Autowired
   ProductRepository proRepo;
	@Override
	public Optional <Products> getByproductName(String productName) {
		return proRepo.findByproductName(productName);
	}

	}


