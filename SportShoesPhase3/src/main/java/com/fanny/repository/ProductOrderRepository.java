package com.fanny.repository;

import org.springframework.data.repository.CrudRepository;

import com.fanny.model.ProductOrder;

public interface ProductOrderRepository extends CrudRepository<ProductOrder, Integer> {

}
