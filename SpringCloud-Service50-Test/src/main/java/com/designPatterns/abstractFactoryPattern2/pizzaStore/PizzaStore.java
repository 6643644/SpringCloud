package com.designPatterns.abstractFactoryPattern2.pizzaStore;

import com.designPatterns.abstractFactoryPattern2.pizza.Pizza;

public abstract class PizzaStore {
	// 為了處理訂單一致，要讓子類別不能修改此方法
	public final Pizza orderPizza(String type) {
		Pizza pizza;

		// createPizza() 從工廠移回 PizzaStroe
		pizza = createPizza(type);

		pizza.prepare();

		return pizza;
	}

	// 把工廠要做的事改成這個抽象工廠方法
	abstract Pizza createPizza(String type);

}
