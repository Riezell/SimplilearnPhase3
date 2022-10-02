package com.fanny.repository;

import org.springframework.data.repository.CrudRepository;

import com.fanny.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
