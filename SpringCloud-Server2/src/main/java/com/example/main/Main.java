package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
/**
 * @author Miles
 * 
 * SpringBoot 的入口:
 * 1. @ComponentScan 自動掃描
 * 2. @SpringBootApplication SprngBoot 啟動路口
 * 
 * 注意:如果SpringBootAppliction的路口放在某個目錄底下，當我們啟動SpringBoot並且掃描Bean的產生時，只會掃描路口所屬的路徑底下。
 * 
 */
@ComponentScan(basePackages = { "com.example" })
@EnableDiscoveryClient
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
    	SpringApplication.run(Main.class, args);
    }

}