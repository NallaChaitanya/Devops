package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	
	 @Autowired
	    UserRepository userRepository;

	    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void create(@RequestBody User user) {
	    	System.out.println("IN isde Save");
	        userRepository.save(user);
	    }

	    @RequestMapping(value = "/{id}") 
	    public User read(@PathVariable String id) {
	        return userRepository.findOne(id);
	    }

	    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void update(@RequestBody User user) {
	        userRepository.save(user);
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	    public void delete(@PathVariable String id) {
	        userRepository.delete(id); 
	    }

}
