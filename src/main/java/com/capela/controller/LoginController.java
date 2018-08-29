package com.capela.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class LoginController {
	
	@GetMapping("/login")
	public ModelAndView Login() {
		return new ModelAndView("login");
	}
	
}

