package com.example.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resources.FeignClientResource;
import com.example.util.LogUtils;

/******************************************************************************************
 * @author Miles
 * 
 *         該Service的入口端 1. @RestController 2. 使用了Apache Log4j 這個日誌系統是Spring
 *         Boot內建的，因為Spring Boot本身內建Tomcat所以預設Log4j功能 3. 但因為Spring boot
 *         1.4以後支援Log4j2，而且效能與速度上Log4j2大勝於其他的日誌系統，故我們就來使用看看。
 * 
 *******************************************************************************************/
@RestController
public class MainRestController {

	@Autowired
	FeignClientResource feignClientResource;

	@RequestMapping("/test0")
	public String testFeignClinetResource() {
		return feignClientResource.testFeignClinetResource();
	}

	@RequestMapping("/testJPA")
	public String testJPA() {
		return feignClientResource.testFeignClinetResource();
	}
	
	@RequestMapping("/testLog4j2")
	public String testLog4j2(){
		Logger log = LogUtils.getExceptionLogger();
    	Logger log1 = LogUtils.getBussinessLogger();
    	Logger log2 = LogUtils.getDBLogger();
    	log.error("getExceptionLogger===日誌測試");
    	log1.info("getBussinessLogger===日誌測試");
		log2.debug("getDBLogger===日誌測試");
		return "helloworld";
	}

}
