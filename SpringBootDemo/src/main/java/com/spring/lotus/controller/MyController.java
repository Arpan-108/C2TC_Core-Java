package com.spring.lotus.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Good Morning!!";
	}
	
}
