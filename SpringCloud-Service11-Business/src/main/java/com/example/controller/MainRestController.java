package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.model.UserRequest;
import com.example.repository.UserRepository;

/******************************************************************************************
 * @author Miles
 * 
 *         該Service的入口端 1. @RestController 2. 使用了Logback，該日誌系統為Spring
 *         Boot內建預設的並且支援使用slf4j。
 * 
 *******************************************************************************************/
@RestController
public class MainRestController {

	private final Logger log = LoggerFactory.getLogger(MainRestController.class);

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(path = "/bus/test")
	public String testFeignClinetResourceClient() {
		log.info("URL:/Test1;testFeignClinetResourceClient()");
		return "testFeignClinetResource";
	}

	@RequestMapping(path = "/bus/jpa/allUser")
	public ResponseEntity<?> getAllUserByJPA() {
		log.info("URL:/TestJPA;getAllUserByJPA()");
		List<User> users = userRepository.findAll();
		ResponseEntity<?> response = ResponseEntity.ok(users);
		return response;
	}

	@RequestMapping(path = "/bus/jpa/user", method = RequestMethod.GET)
	public ResponseEntity<?> getUserById(@RequestParam("id") Integer id) {
		User users = userRepository.findById(id);
		ResponseEntity<?> response = ResponseEntity.ok(users);
		return response;
	}

	@RequestMapping(path = "/bus/jpa/createUser", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody UserRequest request) {
		log.info("createUser");
		User user = new User();
		user.setName(request.getName());
		user.setAddress(request.getAddress());
		User reUser = userRepository.save(user);
		return ResponseEntity.ok(reUser);
	}

}
