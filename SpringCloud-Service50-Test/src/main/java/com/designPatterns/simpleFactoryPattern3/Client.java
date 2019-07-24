package com.designPatterns.simpleFactoryPattern3;

import com.designPatterns.simpleFactoryPattern3.car.Car;

public class Client {

	public static void main(String[] args) {

		Car car = Car.factory("RED");

		car.getDesc();
	}

}
