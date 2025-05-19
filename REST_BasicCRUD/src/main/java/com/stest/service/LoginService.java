package com.stest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stest.dao.LoginDAO;

@Service
public class LoginService {

	@Autowired
	
	private LoginDAO users;
	
	public String getAllUsers() {
		return users.getAllUsers();
	}
}
