package com.example.config;

import java.io.File;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定義 tomcat 配置
 * 細節參考:https://kknews.cc/zh-tw/other/pe2eeoj.html
 * 
 * @author miles
 * 
 */
@Configuration
public class TomcatConfig {

	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		tomcat.setPort(58990); //設定port
		tomcat.setBaseDirectory(new File("C:/Spring Cloud Tomcat")); //設定日誌存放位置
		// tomcat.setUriEncoding("UTF-8"); //如果沒設定語系則預設UTF-8

		return tomcat;
	}

}
