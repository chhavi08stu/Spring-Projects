package com.stest.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stest.main.bean.AdminBean;


@Service
public class LoginService implements loginServiceInterface {

	//@Autowired
	//private AdminBean adminb;
	
	
	@Override
	public List<AdminBean> findAll() {
		// int id, String name, String password
		return Arrays.asList(new AdminBean(12, "abc", "password"), new AdminBean(2, "chhavi", "password2"));
	}

}
