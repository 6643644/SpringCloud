package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Miles
 * @EnableBatchProcessing 註冊SpringBatch
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