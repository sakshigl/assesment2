package com.globallogic.SuperAdmin.superadmin.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class ProductEntity {
	
	public MerchantEntity getMer() {
		return mer;
	}

	public void setMer(MerchantEntity mer) {
		this.mer = mer;
	}

	public ProductEntity() {
		
	}

	public ProductEntity(int id, String name, String color, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryEntity getCat() {
		return cat;
	}

	public void setCat(CategoryEntity cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
    String name;
	
	@Column
	String color;
	
	@Column
	int price;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	CategoryEntity cat;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	MerchantEntity mer;
	
	@OneToOne
	CustomerEntity cus;
	

}
