package com.cts.emart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.SubCategoryEntity;
import com.cts.emart.model.SubCategory;
import com.cts.emart.repo.SubCategoryRepository;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{
	
	@Autowired
	public SubCategoryRepository rep;
	@Override
	public Optional<SubCategory> findBySubCategoryName(String subCategoryName) {
		return rep.findBySubCategoryName(subCategoryName);
	}
	@Override
	public void addSubCategories(SubCategoryEntity subc) {
		rep.save(subc);
		
	}
	@Override
	public void updateSubCategories(SubCategoryEntity subc) {
		rep.save(subc);
		
	}
}
