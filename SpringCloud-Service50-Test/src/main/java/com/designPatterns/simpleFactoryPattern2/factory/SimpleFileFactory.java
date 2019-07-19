package com.designPatterns.simpleFactoryPattern2.factory;

import com.designPatterns.simpleFactoryPattern2.fileType.FileType;
import com.designPatterns.simpleFactoryPattern2.fileType.JSONFile;
import com.designPatterns.simpleFactoryPattern2.fileType.XMLFile;

//工廠模式
public class SimpleFileFactory {
	// 此處違反了OCP原則
	public FileType getFile(String type) {
		if (type.equals("JSON")) {
			return new JSONFile();
		} else if (type.equals("XML")) {
			return new XMLFile();
		} else {
			return null;
		}
	}

}
