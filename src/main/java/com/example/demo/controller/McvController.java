package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class McvController { 
	

	
	@RequestMapping( "/Home")
	   public String home() {
	      return "home";
	   }
	@RequestMapping( "/Login")
	   public String login() {
	      return "login";
	   }
	   
 
}