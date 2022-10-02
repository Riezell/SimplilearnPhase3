package com.fanny.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "product")
@EnableTransactionManagement
public class Product {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProductID")
	private int productID;
	
	@Column(name = "ProductName" )
	private String productName;
	
	@Column(name = "Season")
	private String season;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "Category")
	private String category;
	
	@Column(name = "Price")
	private int price;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "Date")
	private Date date;
	
	@Column(name = "Discount")
	private int discount;
	
	@Column(name = "Quantity")
	private int quantity;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
