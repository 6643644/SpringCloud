package com.example.controller;

import org.springframework.stereotype.Service;

@Service
public class ThisIsService {
	
	private static String sName = "null";
	
	public String getProcessName(String name) throws InterruptedException{
		Thread thread = Thread.currentThread();
		thread.sleep(10000);//暂停1.5秒后程序继续执行
		System.out.println("getProcessName:"+name);
		sName = name;
		return "Hello~"+name;
	}
	
	public String getName(){
		return sName;
	}
}
