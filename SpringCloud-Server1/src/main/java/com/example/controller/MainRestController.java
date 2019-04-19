package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resources.FeignClientResource;

@RestController
public class MainRestController {

	@Autowired
	FeignClientResource feignClientResource;

	@RequestMapping("/test0")
	public String testFeignClinetResource() {
		return feignClientResource.testFeignClinetResource();
	}
	
	@RequestMapping("/testJPA")
	public String testJPA() {
		return feignClientResource.testFeignClinetResource();
	}
	
	
}
