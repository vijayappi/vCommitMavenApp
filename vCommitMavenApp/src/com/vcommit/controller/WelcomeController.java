package com.vcommit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Vijay
 * 
 */
 
@Controller
public class WelcomeController {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		System.out.println("adding a comment in Controller");
 
		String message = "Welcome to Vcommit world";
		return new ModelAndView("welcome", "message", message);
	}
}
