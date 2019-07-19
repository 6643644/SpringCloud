package com.designPatterns.factoryMethodPattern.factory;

import com.designPatterns.factoryMethodPattern.productTV.ProductTV_A;
import com.designPatterns.factoryMethodPattern.productTV.TV;

public class ProductTV_A_Factory implements TVFactory {

	@Override
	public TV createTV() {
		return new ProductTV_A();
	}

}
