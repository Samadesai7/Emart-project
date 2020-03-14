package com.cts.emart.service;



import java.util.Optional;

import com.cts.emart.entity.Products;

public interface ProductService {
	Optional <Products> getByproductName(String productName);


}
