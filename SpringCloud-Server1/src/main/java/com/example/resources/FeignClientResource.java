package com.example.resources;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service2")
public interface FeignClientResource {

	@RequestMapping(value = "/Test1", method = RequestMethod.GET)
	public String testFeignClinetResource();
	
	@RequestMapping(value = "/TestJPA", method = RequestMethod.GET)
	public void testJPA();

}
