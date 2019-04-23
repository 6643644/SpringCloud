package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;

/******************************************************************************************
 * @author Miles
 * 
 * 該Service的入口端
 * 1. @RestController
 * 2. 使用了Logback，該日誌系統為Spring Boot內建預設的並且支援使用slf4j。
 * 
 *******************************************************************************************/
@RestController
public class MainRestController {

	private final Logger log = LoggerFactory.getLogger(MainRestController.class);

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/Test1")
	public String testFeignClinetResourceClient() {
		log.info("URL:/Test1;testFeignClinetResourceClient()");
		return "testFeignClinetResource";
	}

	@RequestMapping("/TestJPA")
	@ResponseBody
	public List<User> getAllUserByJPA() {
		log.info("URL:/TestJPA;getAllUserByJPA()");
		List<User> users = new ArrayList<>();
		users = userRepository.findAll();
		if (users != null && !users.isEmpty()) {
			users.forEach(u1 -> {
				System.out.println("ID:" + u1.getId() + ";NAME:" + u1.getName() + ";ADDRESS:" + u1.getAddress());

			});
		}
		return users;
	}

}
