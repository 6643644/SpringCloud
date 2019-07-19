package com.designPatterns.abstractFactoryPattern.factory;

import com.designPatterns.abstractFactoryPattern.fileType.Loader;

public interface Factory {
	public Loader createFile();
}
