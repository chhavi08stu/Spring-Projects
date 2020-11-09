package com.stest.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.stest.main.loginServiceInterface;
import com.stest.main.bean.AdminBean;

@RestController
@RequestMapping("system/v1.0/dev")
//@EnableAutoConfiguration
public class RestControllerApplication {
	  @RequestMapping("/fresco")
    public String test() {
        return "Hi! Welcome to Fresco World";
    }

	@Autowired
	private loginServiceInterface loginService;

	@GetMapping(value = "/login")

	public List<AdminBean> getLogin() {
		return loginService.findAll();
	}

	@PostMapping(value = "{/id}")

	public String postLogin(@RequestParam int id) {
		System.out.println("id: " + id);
		return "hello. I am garima garg.";
	}
	
	}