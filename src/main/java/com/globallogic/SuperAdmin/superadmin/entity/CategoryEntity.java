package com.globallogic.SuperAdmin.superadmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CategoryEntity() {
		
	}

	public CategoryEntity(String name, String categoryName) {
		super();
		this.name = name;
		CategoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryEntity [name=" + name + ", CategoryName=" + CategoryName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name; 
	
	@Column
	String CategoryName;

}
