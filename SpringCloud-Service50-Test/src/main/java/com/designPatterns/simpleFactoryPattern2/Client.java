package com.designPatterns.simpleFactoryPattern2;

import com.designPatterns.simpleFactoryPattern2.factory.SimpleFileFactory;
import com.designPatterns.simpleFactoryPattern2.fileType.FileType;

public class Client {

	public static void main(String[] args) {
		SimpleFileFactory factory = new SimpleFileFactory();
		FileType file = factory.getFile("JSON");
		file.load();

	}

}
