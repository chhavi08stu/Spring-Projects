package com.stest.dao;

import org.springframework.stereotype.Repository;
import com.stest.bean.LoginUser;

@Repository
public class LoginDAO {
	
	public String getAllUsers() {
		LoginUser user=new LoginUser(1,"ABC");
		return user.toString();
	}
}
