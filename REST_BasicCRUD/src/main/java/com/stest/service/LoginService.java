package com.stest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.stest.dao.LoginDAO;

public class LoginService {

	@Autowired
	private LoginDAO users;
	public LoginDAO getAllUsers() {
		return users;
	}
}
