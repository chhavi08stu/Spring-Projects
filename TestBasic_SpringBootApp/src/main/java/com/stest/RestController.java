package com.stest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.RestController;

//@RestController
@EnableAutoConfiguration
public class RestController {
	  @RequestMapping("/fresco")
    public String test() {
        return "Hi! Welcome to Fresco World";
    }
}