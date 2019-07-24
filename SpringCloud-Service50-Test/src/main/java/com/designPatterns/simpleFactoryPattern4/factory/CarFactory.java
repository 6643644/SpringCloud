package com.designPatterns.simpleFactoryPattern4.factory;

import com.designPatterns.simpleFactoryPattern4.car.BlueCar;
import com.designPatterns.simpleFactoryPattern4.car.Car;
import com.designPatterns.simpleFactoryPattern4.car.RedCar;

public class CarFactory {

	public Car createCarFromColor(String color) {
		switch (color) {
		case "RED":
			return new RedCar();
		case "BLUE":
			return new BlueCar();
		}
		return null;
	}
}
