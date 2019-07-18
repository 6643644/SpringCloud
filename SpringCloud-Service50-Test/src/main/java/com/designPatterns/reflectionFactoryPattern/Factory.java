package com.designPatterns.reflectionFactoryPattern;

public class Factory {
	public void aaa(String clsName) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		Class c = Class.forName(clsName);
		Object obj = c.newInstance();
	}
}
