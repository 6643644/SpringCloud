package com.designPatterns.simpleFactoryPattern;

public class JSONLoader implements Loader {

	@Override
	public void load() {
		System.out.println("This is a JSON Loader");

	}

}
