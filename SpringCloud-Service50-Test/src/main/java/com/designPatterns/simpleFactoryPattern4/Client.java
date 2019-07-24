package com.designPatterns.simpleFactoryPattern4;

import com.designPatterns.simpleFactoryPattern4.car.Car;
import com.designPatterns.simpleFactoryPattern4.factory.CarFactory;

public class Client {

	public static void main(String[] args) {

		CarFactory factory = new CarFactory();

		Car car = factory.createCarFromColor("RED");

		car.getDesc();
	}

}
