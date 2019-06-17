package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.ThisIsBean;


/**
 * @author Miles
 * 
 *
 */
@ComponentScan(basePackages = { "com.example" })
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
//	@Bean
//	public ThisIsBean createBean(String aaa,String bbb){
//		return new ThisIsBean();
//	}
}