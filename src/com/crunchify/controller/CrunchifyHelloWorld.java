package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Crunchify.com
 * 
 */

// @Controller - When Spring scans our package, it will recognize this 
// bean as being a Controller bean for processing requests

@Controller
public class CrunchifyHelloWorld {
 
//The @RequestMapping annotation tells Spring that this 
// Controller should process all requests beginning 
// with /welcome in the URL path. 
// That includes /welcome/* and /welcome.html.
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		System.out.println("========= Controller - CrunchifyHelloWorld ========");
		
		String message = "<br><div align='center'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>"
				+ "This message is comming from CrunchifyHelloWorld.java **********<br><br>";
		
		// olhar crunchify-servlet.xml pois é adiciona prefixo e sufixo
		return new ModelAndView("welcome", "message", message);
		
	}
}
