package com.example.main;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/******************************************************************************************
 * @author Miles
 * 
 * 
 * 
 * 
 * 
 *******************************************************************************************/
@ComponentScan(basePackages = { "com.example" })
// @EnableDiscoveryClient
// @EnableZuulProxy
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	//	@Bean
	//	public EmbeddedServletContainerFactory servletContainer() {
	//		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
	//		tomcat.setPort(9082); //設定port
	//		tomcat.setBaseDirectory(new File("C:/Spring Cloud Tomcat")); //設定日誌存放位置
	//		// tomcat.setUriEncoding("UTF-8"); //如果沒設定語系則預設UTF-8
	//
	//		return tomcat;
	//	}

}