package com.stest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class LoginController {
	
	@GetMapping("/all")
	public String displayAll() {
		return "Hello!";
	}

}
