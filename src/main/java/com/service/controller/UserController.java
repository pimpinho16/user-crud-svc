package com.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.pojo.User;
import com.service.process.UserProcess;

@RestController
public class UserController {
	
	UserProcess process;
	
	public UserController(UserProcess process) {
		this.process = process;
	}

	@GetMapping("${config.endpoints.user.list.url}")
	public List<User> getUsers(){
		
		return process.getUsers();
	}
	
}
