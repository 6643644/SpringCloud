package com.designPatterns.simpleFactoryPattern;

import com.designPatterns.simpleFactoryPattern.LoaderFactory.LoaderType;

public class SimpleFactoryPatternMain {

	public static void main(String[] args) {
		//這是尚未使用Simple Factory Pattern 的寫法
//		Loader loader = new XMLLoader(); // 直接用new建立物件
//	    loader.load();
		
		Loader loader = LoaderFactory.getLoader(LoaderType.JSON);
	    loader.load();

	}

}
