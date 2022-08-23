package com.globallogic.MyProject.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", category="
				+ category + ", merchant=" + merchant + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;

	@Column
	private String color;

	@Column
	private double price;
	
	@OneToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="merchant_id", referencedColumnName = "GST_no")
	private MerchantEntity merchant;
	

	public ProductEntity(int id, String name, String color, double price, CategoryEntity category,
			MerchantEntity merchant) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.category = category;
		this.merchant = merchant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	
	public MerchantEntity getMerchant() {
		return merchant;
	}

	public void setMerchant(MerchantEntity merchant) {
		this.merchant = merchant;
	}

	public ProductEntity() {

	}	
	
}
