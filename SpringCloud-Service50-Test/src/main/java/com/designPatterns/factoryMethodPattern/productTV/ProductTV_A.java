package com.designPatterns.factoryMethodPattern.productTV;

public class ProductTV_A implements TV{

	@Override
	public void turnOn() {
		System.out.println("ProductTV_A ON");
		
	}

	@Override
	public void trunOff() {
		System.out.println("ProductTV_A OFF");
		
	}

}
