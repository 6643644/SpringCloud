package com.designPatterns.factoryMethodPattern.productTV;

public class ProductTV_B implements TV{

	@Override
	public void turnOn() {
		System.out.println("ProductTV_B ON");
		
	}

	@Override
	public void trunOff() {
		System.out.println("ProductTV_B OFF");
		
	}

}
