package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	
	@Autowired
	ThisIsMain thisIsMain;
	
	@Autowired
	ThisIsService thisIsService;
	
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
	
	@RequestMapping("/testService")
	public String testService(@RequestParam("name") String name) throws InterruptedException{
		System.out.println("Service1 name:"+name);
		String getName = thisIsService.getProcessName(name);
		return getName;
	}
	
	@RequestMapping("/testService2")
	public String testService2(@RequestParam("name") String name) throws InterruptedException{
		System.out.println("Service2 name:"+name);
		String getName = thisIsService.getProcessName(name);
		return getName;
	}
	
	@RequestMapping("/testService3")
	public String testService3() throws InterruptedException{
		return thisIsService.getName();
	}
}
