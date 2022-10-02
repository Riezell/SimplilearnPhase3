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

import com.fanny.model.User;
import com.fanny.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	//retrieve all the user
	@GetMapping("/alluser")
	public List<User> getAllUser(){
		List<User> user =(List<User>) userRepository.findAll();
		return user;
		
	}
	
	//add new user
	@PostMapping("/adduser")
    public  User addUser(@RequestBody User user) {
		return userRepository.save(user);
    	
    }
	//get a particular user
	@GetMapping("/user/{id}")
	public Optional<User> getUserId(@PathVariable int id){
		return userRepository.findById(id);
		
	}
	//udate existing user
	@PutMapping("/update/{id}")
	public User updateUser(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	
	//delete particular user
	@DeleteMapping("delete/{id}")
	public void deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
		
	}
	
}
