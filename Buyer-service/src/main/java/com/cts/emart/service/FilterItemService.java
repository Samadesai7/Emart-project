package com.cts.emart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.entity.Products;
import com.cts.emart.repository.FilterRepository;

@Service
public class FilterItemService {

	@Autowired
	FilterRepository repo;

	public List<Products> filterByStartPrice(double startPrice) {
		return repo.findAllByStartPrice(startPrice);
	}

	public List<Products> filterByEndPrice(double endPrice) {
		return repo.findAllByEndPrice(endPrice);
	}

	public List<Products> filterByPrice(double startPrice, double endPrice) {
		return repo.findAllByPrice(startPrice, endPrice);
	}

}
