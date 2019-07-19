package com.designPatterns.abstractFactoryPattern.factory;

import com.designPatterns.abstractFactoryPattern.fileType.Loader;

public class GenFile {

	public static Loader gen(String type) {

		Factory factoyr = new Factory() {

			@Override
			public Loader createFile() {

				return new Loader() {

					@Override
					public void load() {
						System.out.println("File Type:" + type);

					}

				};
			}

		};
		return factoyr.createFile();

	}
}
