package com.vcommit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Vijay
 * 
 */
 
@Controller
public class Welcome123Controller {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "Welcome to Vcommit world";
		return new ModelAndView("welcome", "message", message);
	}
}
