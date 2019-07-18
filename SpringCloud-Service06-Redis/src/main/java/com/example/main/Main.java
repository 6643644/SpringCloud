package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/******************************************************************************************
 * @author Miles
 * @EnableRedisHttpSession 代表啟動Redis HttpSession管理Session機制          
 * 
 *******************************************************************************************/
@ComponentScan(basePackages = { "com.example" })
@EnableDiscoveryClient
@EnableFeignClients(basePackages = { "com.example" })
@SpringBootApplication
//@EnableRedisHttpSession
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
