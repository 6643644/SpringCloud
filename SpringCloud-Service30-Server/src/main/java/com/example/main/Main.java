package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Miles
 * 
 * 該服務主要進行tomcat自定義配置
 * 
 * 1. @ComponentScan 自動掃描 
 * 2. @EnableDiscoveryClient 註冊 eureka 客戶端
 * 3. @EnableFeignClients 開啟Feign 聲明式Web Service客戶端
 * 4. @SpringBootApplication SprngBoot 啟動路口
 * 
 * 注意:如果SpringBootAppliction的路口放在某個目錄底下，當我們啟動SpringBoot並且掃描Bean的產生時，只會掃描路口所屬的路徑底下。
 * 
 */
@ComponentScan(basePackages = { "com.example" })
@EnableDiscoveryClient
@EnableFeignClients(basePackages = { "com.example" })
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}