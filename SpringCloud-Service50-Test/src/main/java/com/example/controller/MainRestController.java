package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainRestController {
	
	@Autowired
	ThisIsMain thisIsMain;
	
	@RequestMapping("/test")
	public String testURL() {
		return "Miles";
	}
	
	@RequestMapping("/testBean")
	public void testThisIsBean(){
		System.out.println("thisIsMain is null?"+thisIsMain);
		ThisIsBean thisIsBean = thisIsMain.getThisIsBean("Miles", "29");
		System.out.println("thisIsMain is null?"+thisIsBean.getName()+","+thisIsBean.getValue());
		
	}
}
