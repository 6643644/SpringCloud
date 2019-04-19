package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	@RequestMapping("/Test1")
	public String testFeignClinetResourceClient() {
		return "testFeignClinetResource";
	}
	
}
