package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Miles
 * 
 * 閰脣��Spring Cloud Eureka Server蝡�
 * SpringBoot ���:
 * 1. @ComponentScan ������
 * 2. @SpringBootApplication SprngBoot ���楝�
 * 
 * 瘜冽��:憒�pringBootAppliction��楝����������������pringBoot銝虫���ean����������楝���撅祉�楝敺����
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