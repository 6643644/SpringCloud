package com.designPatterns.abstractFactoryPattern;

import com.designPatterns.abstractFactoryPattern.factory.GenFile;
import com.designPatterns.abstractFactoryPattern.fileType.Loader;

public class Client {

	public static void main(String[] args) {
		Loader file = GenFile.gen("XML");
		file.load();
	}

}
