package com.stest.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system/v1.0/dev")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/rest/login")
	public String sayHello() {
		return "Swagger Hello World";
	}
}