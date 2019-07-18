package com.example.resources;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.resources.dto.UserRequest;
import com.example.resources.dto.UserResponse;

@FeignClient(name = "business")
public interface FeignClientResource {
	
	@RequestMapping(value = "/bus/test", method = RequestMethod.GET)
	public String testFeignClinetResource();

	@RequestMapping(value = "/bus/jpa/allUser", method = RequestMethod.GET)
	public List<UserResponse> getAllUser();
	
	@RequestMapping(value = "/bus/jpa/user", method = RequestMethod.GET)
	public UserResponse getUserById(@RequestParam("id") Integer id);

	@RequestMapping(value = "/bus/jpa/createUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse createUser(@RequestBody UserRequest request);
}
