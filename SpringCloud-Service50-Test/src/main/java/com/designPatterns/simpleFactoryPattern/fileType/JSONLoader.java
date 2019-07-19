package com.designPatterns.simpleFactoryPattern.fileType;

public class JSONLoader implements Loader {

	@Override
	public void load() {
		System.out.println("This is a JSON Loader");

	}

}
