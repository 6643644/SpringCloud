package com.designPatterns.factoryMethodPattern;

import com.designPatterns.factoryMethodPattern.factory.ProductTV_A_Factory;
import com.designPatterns.factoryMethodPattern.factory.ProductTV_B_Factory;
import com.designPatterns.factoryMethodPattern.factory.TVFactory;
import com.designPatterns.factoryMethodPattern.productTV.TV;

public class Client {

	public static void main(String[] args) {
		TVFactory factory = new ProductTV_A_Factory();
//		TVFactory factory = new ProductTV_B_Factory();
		TV tv = factory.createTV();
		
		tv.turnOn();
	}

}
