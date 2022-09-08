package com.fachex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fachex.service.FachexService;

@Controller
public class FachexController {
	
	@Autowired
	FachexService fachexService;
}
