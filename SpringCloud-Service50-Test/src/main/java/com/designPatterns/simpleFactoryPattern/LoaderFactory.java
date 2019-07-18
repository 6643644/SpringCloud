package com.designPatterns.simpleFactoryPattern;

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
