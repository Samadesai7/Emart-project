package com.cts.emart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.ProductsEntity;
import com.cts.emart.model.Products;
import com.cts.emart.repo.ProductsRepository;
@Service
public class ProductServiceImpl implements ProductsService {
	
	@Autowired
	public ProductsRepository proRep;

	@Override
	public Optional<Products> findByProductName(String productName) {
		// TODO Auto-generated method stub
		return proRep.findByProductName(productName);
	}

	@Override
	public void addProducts(ProductsEntity pro) {
		proRep.save(pro);
		
	}

	@Override
	public Iterable<ProductsEntity> findAll2() {
		// TODO Auto-generated method stub
		return proRep.findAll();
	}

}
