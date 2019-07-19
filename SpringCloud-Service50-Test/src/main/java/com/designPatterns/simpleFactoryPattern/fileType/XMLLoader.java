package com.designPatterns.simpleFactoryPattern.fileType;

public class XMLLoader implements Loader{

	@Override
	public void load() {
		System.out.println("this is a XML Loader");
		
	}

}
