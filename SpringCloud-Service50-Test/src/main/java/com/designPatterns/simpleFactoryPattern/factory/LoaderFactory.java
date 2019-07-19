package com.designPatterns.simpleFactoryPattern.factory;

import com.designPatterns.simpleFactoryPattern.fileType.JSONLoader;
import com.designPatterns.simpleFactoryPattern.fileType.Loader;
import com.designPatterns.simpleFactoryPattern.fileType.XMLLoader;

public class LoaderFactory {
	public static Loader getLoader(LoaderType type) {
		switch (type) {
		case XML: {
			return new XMLLoader();
		}
		case JSON: {
			return new JSONLoader();
		}
		default: {
			return null;
		}
		}
	}

	public enum LoaderType {
		XML, CSV, JSON
	}
}
