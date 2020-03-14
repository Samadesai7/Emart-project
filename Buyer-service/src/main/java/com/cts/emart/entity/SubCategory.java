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
@Table(name="subcategory")
public class SubCategory {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sId")
	private int subCategoryId;
	@Column(name="sName")
	private String subCategoryName;
	@ManyToOne
	@JoinColumn(name="cId")
	
	private Category categoryId;
	public SubCategory() {
		
	}
	
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	
}
