package com.stest.dao;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	LoginUser user=new LoginUser(1,"ABC");
	public String getAllUsers() {
		return "{ABC,HELLO}";
	}

}
