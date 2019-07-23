package com.designPatterns.simpleFactoryPattern.fileType;

/******************************************************************************************
 * @author Miles
 *  Simple Factory Pattern 
 *  
 *  
 * 
******************************************************************************************/
public class JSONLoader implements Loader {

	@Override
	public void load() {
		System.out.println("This is a JSON Loader");

	}

}
