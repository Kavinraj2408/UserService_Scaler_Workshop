package com.kavin.scalerworkshop.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kavin.scalerworkshop.UserService.entity.UserEntity;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping("/{id}")
	public UserEntity getUserDetailsById(@PathVariable long id) {
		UserEntity user = new UserEntity();
		user.setAdmin(true);
		user.setMail("xxx@gmail.com");
		user.setName("Kavin");
		user.setPassword("abcd");
		return user;
	}

}
