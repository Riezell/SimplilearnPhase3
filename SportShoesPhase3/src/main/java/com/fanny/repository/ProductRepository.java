package com.fanny.repository;

import org.springframework.data.repository.CrudRepository;

import com.fanny.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
