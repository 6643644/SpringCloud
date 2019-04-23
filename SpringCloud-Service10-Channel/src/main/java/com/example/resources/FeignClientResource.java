package com.example.resources;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.resources.dto.User;

@FeignClient(name = "business")
public interface FeignClientResource {

	@RequestMapping(value = "/bus/test", method = RequestMethod.GET)
	public String testFeignClinetResource();
	
	@RequestMapping(value = "/bus/allUser", method = RequestMethod.GET)
	public List<User> getAllUser();

}
