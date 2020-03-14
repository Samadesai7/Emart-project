package com.cts.emart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.Products;
import com.cts.emart.entity.SubCategory;

import com.cts.emart.repository.SubCategoryRepository;

@Service

public class SubCategoryServiceImpl implements SubCategoryService {
	@Autowired
	public SubCategoryRepository subcatRep;
	@Override
	public Optional <SubCategory> getBySubCategoryName(String subCategoryName) {
		return subcatRep.findBySubCategoryName(subCategoryName);
	}
	@Override
	public SubCategory findBySubCategoryName(String subCategoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
