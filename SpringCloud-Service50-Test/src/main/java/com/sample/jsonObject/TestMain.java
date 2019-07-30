package com.sample.jsonObject;

import java.util.List;

import org.json.JSONObject;


public class TestMain {

	public static void main(String[] args) {
		TestEneity entity = new TestEneity();
		entity.setId("1");
		entity.setName("2");
		JSONObject jsonObj = new JSONObject(entity);
		System.out.println("jsonObj:"+jsonObj);

	}

	public void sortUsingJava7(List<String> names1) {
		// TODO Auto-generated method stub
		
	}
}
