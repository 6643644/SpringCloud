package com.designPatterns.factoryMethodPattern.factory;

import com.designPatterns.factoryMethodPattern.productTV.ProductTV_B;
import com.designPatterns.factoryMethodPattern.productTV.TV;

public class ProductTV_B_Factory implements TVFactory {

	@Override
	public TV createTV() {
		return new ProductTV_B();
	}

}
