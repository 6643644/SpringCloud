package com.designPatterns.abstractFactoryPattern2;

import com.designPatterns.abstractFactoryPattern2.pizza.Pizza;
import com.designPatterns.abstractFactoryPattern2.pizzaStore.NYPizzaStore;
import com.designPatterns.abstractFactoryPattern2.pizzaStore.PizzaStore;

public class Client {

	public static void main(String[] args) {
		PizzaStore store = new NYPizzaStore(); //對應抽象類別

		Pizza pizza = store.orderPizza("cheese");

		System.out.println("Client: this is a " + pizza.getName());

	}

}
