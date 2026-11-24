package com.wipro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api/v1/hello")
@RestController
public class HelloController {
	@GetMapping
	public String sayHello()
	{
		
		return "Hello";
	}

	
}
