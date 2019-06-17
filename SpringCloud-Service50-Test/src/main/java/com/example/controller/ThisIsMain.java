package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThisIsMain {
	
	@Autowired
	ThisIsBean thisIsBean;
	
	public  ThisIsBean getThisIsBean(String name,String value){
		if(thisIsBean!=null){
			System.out.println("thisIsBean is not null");
			thisIsBean.setName(name);
			thisIsBean.setValue(value);
		}else{
			System.out.println("thisIsBean is null");
			thisIsBean = new ThisIsBean();
			thisIsBean.setName(name);
			thisIsBean.setValue(value);
			return thisIsBean;
		}
		return thisIsBean;
	}
	
	
}
