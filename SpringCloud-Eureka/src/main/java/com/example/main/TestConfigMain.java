package com.example.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigMain {

	@Value("${spring.application.name}")
	private String appName;

//	@Value("${server.port}")
//	private String port;

	@RequestMapping(value = "/appName")
	public String getAppName() {
		return appName;
	}

//	@RequestMapping(value = "/serverPort")
//	public String getServerPort() {
//		return port;
//	}

}
