package com.fanny.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanny.model.ProductOrder;
import com.fanny.repository.ProductOrderRepository;



@RestController
@RequestMapping("productOrder")
public class ProductOrderController {
	
	@Autowired
	ProductOrderRepository productOrderRepository;
	
	//retrieve all the productOrder
	@GetMapping("allproductorder")
	public List<ProductOrder> getAllProductOrder(){
		List<ProductOrder> productOrder = (List<ProductOrder>) productOrderRepository.findAll();
		return productOrder;
		
	}
	//add new productOrder
	@PostMapping("addProductOrder")
	public ProductOrder addProductOrder(@RequestBody ProductOrder productOrder) {
		return productOrderRepository.save(productOrder);
		
	}
	
	//get a particular ProductOrder
	@GetMapping("productorder/{id}")
	public Optional<ProductOrder> getProductOrderId(@PathVariable int id){
		return productOrderRepository.findById(id);
		
	}
	//update 
	@PutMapping("update/{id}")
	public ProductOrder updateProductOrder(@RequestBody ProductOrder productOrder) {
		return productOrderRepository.save(productOrder);
		
	}
	
	//delete
	@DeleteMapping("delete/{id}")
	public void deleteProdutOrder(@PathVariable int id) {
		productOrderRepository.deleteById(id);
	}


}
