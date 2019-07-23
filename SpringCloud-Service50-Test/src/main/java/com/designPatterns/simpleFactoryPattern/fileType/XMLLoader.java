package com.designPatterns.simpleFactoryPattern.fileType;

/******************************************************************************************
 * @author Miles
 *  Simple Factory Pattern 
 *  
 *  
 * 
******************************************************************************************/
public class XMLLoader implements Loader {

	@Override
	public void load() {
		System.out.println("this is a XML Loader");

	}

}
