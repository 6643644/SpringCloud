package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;

@RestController
public class MainRestController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/Test1")
	public String testFeignClinetResourceClient() {
		return "testFeignClinetResource";
	}

	@RequestMapping("/TestJPA")
	@ResponseBody
	public List<User> getAllUserByJPA() {
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
