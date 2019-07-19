package com.designPatterns.simpleFactoryPattern2.fileType;

public class XMLFile implements FileType {

	@Override
	public void load() {
		System.out.println("XMLFile Load...");

	}

}
