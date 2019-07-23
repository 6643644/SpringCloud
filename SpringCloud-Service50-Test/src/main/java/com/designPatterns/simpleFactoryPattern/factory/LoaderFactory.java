package com.designPatterns.simpleFactoryPattern.factory;

import com.designPatterns.simpleFactoryPattern.fileType.JSONLoader;
import com.designPatterns.simpleFactoryPattern.fileType.Loader;
import com.designPatterns.simpleFactoryPattern.fileType.XMLLoader;

/******************************************************************************************
 * @author Miles
 *  Simple Factory Pattern 
 *  此類別為 簡單工廠的設計模式 的 讀取物件工廠
 *  統一將生產物件的責任交由工廠，請根據不同的傳入值產生不同類型的工廠物件。
 * 
******************************************************************************************/
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
