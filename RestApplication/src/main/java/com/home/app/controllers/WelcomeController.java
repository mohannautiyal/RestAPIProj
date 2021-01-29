package com.home.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping(value="/")
	public String welcomeEmp() {
		
		return "Welcome to Madan's Home Page . Sample App for DevOps Learning";
	}

}
