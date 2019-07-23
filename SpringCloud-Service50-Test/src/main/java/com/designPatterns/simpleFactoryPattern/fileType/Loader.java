package com.designPatterns.simpleFactoryPattern.fileType;

/******************************************************************************************
 * @author Miles
 *  Simple Factory Pattern 
 *  此介面主要規範讀取動作，實際讀取方式由實作介面者自行實現。
 *  
 * 
******************************************************************************************/
public interface Loader {

	// 讀取用
	public void load();

}
