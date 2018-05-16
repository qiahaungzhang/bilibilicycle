package com.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
     
	
	@RequestMapping("regist")
	public void register(User user){
		
	}
	
}
