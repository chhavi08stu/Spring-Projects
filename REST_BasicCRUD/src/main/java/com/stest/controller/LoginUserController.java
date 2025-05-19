package com.stest.controller;

import com.stest.dao.LoginDAO;
import com.stest.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginUserController {

	@Autowired
	
	private LoginService lservice=null; 
	
	@GetMapping("/users/all")
	public String getUsers() {
		return lservice.getAllUsers();
	}
}
