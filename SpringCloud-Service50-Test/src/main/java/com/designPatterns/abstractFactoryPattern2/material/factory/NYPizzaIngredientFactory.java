package com.designPatterns.abstractFactoryPattern2.material.factory;

import com.designPatterns.abstractFactoryPattern2.material.NY.NYCheese;
import com.designPatterns.abstractFactoryPattern2.material.NY.NYSauce;
import com.designPatterns.abstractFactoryPattern2.material.NY.NYVeggies;
import com.designPatterns.abstractFactoryPattern2.material.rule.Cheese;
import com.designPatterns.abstractFactoryPattern2.material.rule.Sauce;
import com.designPatterns.abstractFactoryPattern2.material.rule.Veggies;

/******************************************************************************************
 * @author Miles
 * Abstract Factory Pattern 
 * 抽象工廠設計模式
 * 對於所有原料，紐約原料工廠都提供了紐約的版本
 * 
******************************************************************************************/
public class NYPizzaIngredientFactory extends PizzaIngredientFactory {

	@Override
	public Sauce createSauce() {
		return new NYSauce();
	}

	@Override
	public Cheese createCheese() {
		return new NYCheese();
	}

	@Override
	public Veggies createVeggies() {
		return new NYVeggies();
	}

}
