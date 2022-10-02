package com.fanny.controller;


	import java.sql.Date;
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

import com.fanny.model.Product;
import com.fanny.repository.ProductRepository;


	@RestController
	@RequestMapping("/products")
	public class ProductController {
		
		@Autowired
		ProductRepository productRepository;
		
		//retrieve all products from database
		@GetMapping("/all")
		public List<Product> getAllProducts(){
			
			List<Product> product = (List<Product>) productRepository.findAll();
			return product;
			
		}
		
		//insert new product into database
		@PostMapping("/add")
		public Product addproduct(@RequestBody Product product) {
			return productRepository.save(product);
			
		}
		
		//get particular product by id
		@GetMapping("/product/{id}/{season}/{brand}/{category}/{price}/{color}/{date}")
		public Optional<Product> getProductDetails(@PathVariable int id,String season,String brand,String category,int price,String color,Date date){
			return productRepository.findById(id);
			
		}
		
		//update existing product
		@PutMapping("/update/{id}")
		public Product updateProduct(@RequestBody Product product){
			return productRepository.save(product);
			
		}
		
		//delete particular student from database
		@DeleteMapping("/delete/{id}")
		public void  deleteproduct(@PathVariable int id) {
			productRepository.deleteById(id);
		}
			
		

}
