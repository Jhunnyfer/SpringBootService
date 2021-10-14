package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping({ "/" })
	public String home() {
		return "API VERSRION 1.0.0";
	}

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}