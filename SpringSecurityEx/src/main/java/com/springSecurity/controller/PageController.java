package com.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/login")
	public String home() {
		return "home";
		
		
	}
	
	
}
