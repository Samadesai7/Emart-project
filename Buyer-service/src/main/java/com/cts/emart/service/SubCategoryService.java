package com.cts.emart.service;

import java.util.Optional;


import com.cts.emart.entity.SubCategory;

public interface SubCategoryService {
	SubCategory findBySubCategoryName(String subCategoryName);

	Optional<SubCategory> getBySubCategoryName(String subCategoryName);


}
