package com.example.controller;

import java.util.List;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.resources.FeignClientResource;
import com.example.resources.dto.UserRequest;
import com.example.resources.dto.UserResponse;
import com.example.util.LogUtils;

/******************************************************************************************
 * @author Miles
 * 
 * 該Service的入口端
 * 1. @RestController Spring Restful實現 
 * 2. 使用了Apache Log4j 這個日誌系統是Spring Boot內建的，因為Spring Boot本身內建Tomcat所以預設Log4j功能 
 * 3. 但因為Spring boot
 * 4. 1.4以後支援Log4j2，而且效能與速度上Log4j2大勝於其他的日誌系統，故我們就來使用看看。
 * 
 *******************************************************************************************/
@RestController
public class MainRestController extends AbstractBaseApplication {

	@Autowired
	FeignClientResource feignClientResource;

	@RequestMapping("/test")
	public String testJPA() {
		return feignClientResource.testFeignClinetResource();
	}

	@RequestMapping("/allUser")
	public List<UserResponse> testLog4j2() {
		List<UserResponse> users = feignClientResource.getAllUser();
		if (users != null) {
			users.forEach(u -> {
				System.out.println("User ID:" + u.getId() + ";Name:" + u.getName() + ";Address:" + u.getAddress());
			});
		} else {
			System.out.println("users is null...");
		}
		Logger log = LogUtils.getExceptionLogger();
		Logger log1 = LogUtils.getBussinessLogger();
		Logger log2 = LogUtils.getDBLogger();
		log.error("getExceptionLogger===日誌測試");
		log1.info("getBussinessLogger===日誌測試");
		log2.debug("getDBLogger===日誌測試");
		return users;
	}

	@RequestMapping("/create")
	public UserResponse createUser() {
		UserRequest request = new UserRequest();
		request.setName("John");
		request.setAddress("新北市板橋區文化路6段544號499樓");
		return feignClientResource.createUser(request);

	}
}
