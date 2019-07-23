package com.designPatterns.abstractFactoryPattern2.pizza;

import com.designPatterns.abstractFactoryPattern2.material.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory mFactory;

	// 次類別在建構時代入一個原料工廠
	public CheesePizza(PizzaIngredientFactory factory) {
		mFactory = factory;
	}

	// 次類別一定要實作這個方法
	@Override
	public void prepare() {
		// 這邊就是神奇的地方，工廠會因為建構式代入
		// 不同的工廠，而產生不同的原料
		// Pizza 不在乎是什麼工廠，只知道要原料
		// 跟工廠拿就對了
		sauce = mFactory.createSauce();
		cheese = mFactory.createCheese();
		veggies = mFactory.createVeggies();
	}
}
