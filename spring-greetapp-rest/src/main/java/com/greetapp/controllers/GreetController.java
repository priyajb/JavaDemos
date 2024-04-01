package com.greetapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/show")
	public String showMessage()
	{
		return "have a great day";
	}
    //http://localhost:8080/say-hello/p
    //data comes in the url itself
    @GetMapping("/say-hello/{uname}")
	public String sayHello(@PathVariable("uname") String username){
    	return "Hello "+username;
    }
    @GetMapping("/user-details")
	public String showUserDetails(@RequestParam("name") String username,@RequestParam("city") String city){
    	return " Hello "+username + " from " +city;
    }
    
    @GetMapping("/show-courses")
	public List<String> showCourses(){
    	return Arrays.asList("java","html","spring");
    }
}
