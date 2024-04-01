package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
	@RequestMapping("/greet")
	public String getUser(Model model)
	{
		//call service layer from here
		//add attribute and send to next page
		model.addAttribute("message", "great day");
		return "success";//this is the view name that is the jsp page
		
	}
	@RequestMapping("/hello")
	public String sayHello(ModelMap model)
	{
		model.addAttribute("message", "hello!! have a good day");
		return "success";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeUser()
	{
		ModelAndView modelAndView=new ModelAndView("success", "message","welcome to mvc");
		return modelAndView;
	}
}
