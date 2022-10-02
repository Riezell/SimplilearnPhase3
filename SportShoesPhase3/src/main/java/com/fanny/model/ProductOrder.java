package com.fanny.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "productorder")
@EnableTransactionManagement
public class ProductOrder {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USerID")
	private int userId;
	

	
	@Column(name = "ProductID")
	private int productId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	


}
