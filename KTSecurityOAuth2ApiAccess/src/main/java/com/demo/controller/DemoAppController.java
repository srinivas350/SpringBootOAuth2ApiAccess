package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAppController {
	
	@GetMapping("/app/getValue/{value}")
	public String getValue(@PathVariable String value) {
		return "Authorized the API and the value is "+value;
	}

}
