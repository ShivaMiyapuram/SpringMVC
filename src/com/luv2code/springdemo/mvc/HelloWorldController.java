package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial form

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";

	}

	// process the form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new method to read form data 
	// and add it to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutOut(HttpServletRequest httpServletRequest, Model model) {
		String theName = httpServletRequest.getParameter("studentName");
		
		String result = "What's up ?  " + theName.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		String result = "Hey! My friend!!  " + theName.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	
}
