package com.designPatterns.simpleFactoryPattern2.fileType;

public class JSONFile implements FileType {

	@Override
	public void load() {
		System.out.println("JSONFile Load...");
		
	}

}
