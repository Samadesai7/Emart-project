package com.cts.emart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.entity.Category;
import com.cts.emart.entity.OrderDetails;
import com.cts.emart.entity.Orders;
import com.cts.emart.entity.Payment;
import com.cts.emart.entity.Products;
import com.cts.emart.entity.SubCategory;

import com.cts.emart.service.CategoryService;
import com.cts.emart.service.OrderDetailsService;
import com.cts.emart.service.OrderService;
import com.cts.emart.service.ProductService;
import com.cts.emart.service.SubCategoryService;

@RestController
public class BuyerController {
	@Autowired
	private CategoryService categoryserv;
	@Autowired
	private ProductService proRepo;
	@Autowired
	private SubCategoryService serv;
	@Autowired
	private  OrderService ord;
	@Autowired
	private OrderDetailsService det;

	@RequestMapping("Categories/{categoryName}")
	public ResponseEntity<Category> getCategoryBycategoryName(
			@PathVariable(name = "categoryName") String categoryName) {
		ResponseEntity<Category> result;
		Category entity = categoryserv.getBycategoryName(categoryName).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Category>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
		}
		return result;
	}

	@RequestMapping("Products/{productName}")
	public ResponseEntity<Products> getByproductName(@PathVariable(name = "productName") String productName) {
		ResponseEntity<Products> result;
		Products ent = proRepo.getByproductName(productName).orElse(null);
		if (null != ent) {
			result = new ResponseEntity<Products>(ent, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Products>(HttpStatus.NOT_FOUND);
		}
		return result;
	}

	@RequestMapping("subcategory/{subCategoryName}")
	public ResponseEntity<SubCategory> getBySubCategoryName(
			@PathVariable(name = "subCategoryName") String subCategoryName) {
		ResponseEntity<SubCategory> result;
		SubCategory sub = serv.getBySubCategoryName(subCategoryName).orElse(null);
		if (null != sub) {
			result = new ResponseEntity<SubCategory>(sub, HttpStatus.OK);
		} else {
			result = new ResponseEntity<SubCategory>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
	@RequestMapping("orders/{orderId}")
	public ResponseEntity<Orders> getById(@PathVariable(name = "orderId") int orderId) {
		ResponseEntity<Orders> result;
		Orders ent = ord.findById(orderId);
		if (null != ent) {
			result = new ResponseEntity<Orders>(ent, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Orders>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
//	@RequestMapping("/orderDetails")
//	List<OrderDetails> getAllDetails() {
//		return det.getAllDetails();
//	}
	@RequestMapping("orderDetails/{Id}")
	public ResponseEntity<OrderDetails> findById(@PathVariable(name = "Id") int id) {
		ResponseEntity<OrderDetails> result;
		OrderDetails ord = det.findById(id);
		if (null != ord) {
			result = new ResponseEntity<OrderDetails>(ord, HttpStatus.OK);
		} else {
			result = new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
	@RequestMapping("/orderDetails")
	public ResponseEntity<List<OrderDetails>> getAll() {
		return new ResponseEntity<List<OrderDetails>>(HttpStatus.OK);
	}


	
}
