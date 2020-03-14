package com.cts.emart.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Products")
public class Products {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pId")
	private int productId;
	@Column(name="pName")
	private String productName;
	@Column(name="price")
	private int price;
	@Column(name="disc")
	private String description;
	@ManyToOne
	private SubCategory subCategoryId;
	
	public Products() {
		
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public SubCategory getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(SubCategory subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
}