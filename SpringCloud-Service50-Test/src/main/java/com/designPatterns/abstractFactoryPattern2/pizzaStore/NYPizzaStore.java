package com.designPatterns.abstractFactoryPattern2.pizzaStore;

import com.designPatterns.abstractFactoryPattern2.material.factory.NYPizzaIngredientFactory;
import com.designPatterns.abstractFactoryPattern2.material.factory.PizzaIngredientFactory;
import com.designPatterns.abstractFactoryPattern2.pizza.CheesePizza;
import com.designPatterns.abstractFactoryPattern2.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;

		// 因為是紐約店，所以使用紐約原料工廠
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

		// 對於每一種 pizza，一律實體化一個新 pizza，
		// 並傳進該 pizza 所需的工廠，
		// 以取得對應的原料
		if (item.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setName("New York style cheese pizza");
		} else if (item.equals("beef")) {
			//			pizza = new BeefPizza(factory);
			//			pizza.setName("New York style beef pizza");
		}

		return pizza;
	}

}
