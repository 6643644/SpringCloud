package com.designPatterns.abstractFactoryPattern2.material.NY;

import com.designPatterns.abstractFactoryPattern2.material.rule.Cheese;

public class NYCheese implements Cheese {

	@Override
	public void desc() {
		System.out.println("this is NY Cheese");

	}

}
