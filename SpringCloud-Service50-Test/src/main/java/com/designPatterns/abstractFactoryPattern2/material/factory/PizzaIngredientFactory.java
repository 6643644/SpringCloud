package com.designPatterns.abstractFactoryPattern2.material.factory;

import com.designPatterns.abstractFactoryPattern2.material.rule.Cheese;
import com.designPatterns.abstractFactoryPattern2.material.rule.Sauce;
import com.designPatterns.abstractFactoryPattern2.material.rule.Veggies;

/******************************************************************************************
 * @author Miles
 * Abstract Factory Pattern 
 * 抽象工廠設計模式
 * 每個原料都是一個類別，每個原料都有一個對應的方法建立該原料
 * 
******************************************************************************************/
public abstract class PizzaIngredientFactory {
	public abstract Sauce createSauce();

	public abstract Cheese createCheese();

	public abstract  Veggies createVeggies();
}
