package com.example.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigMain {

	@Value("${server.port}")
	private String serverPort;

	@RequestMapping(value = "/port")
	public String getServerPort() {
		return serverPort;
	}
}
