package com.fachex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fachex.service.FachexService;

@Controller
public class FachexController {
	
	@Autowired
	FachexService fachexService;
	
	@GetMapping("/index")
	public String  index() {
		return "index";
	}
	@GetMapping("/gallery")
	public String Gallery() {
		return "gallery";
	}
	@GetMapping("/AboutUs")
	public String aboutUs() {
		return "AboutUS";
	}
	@GetMapping("/ContactUs")
	public String contactus() {
		return "ContactUs";
	}
}
