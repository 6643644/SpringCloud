package com.designPatterns.simpleFactoryPattern3.car;

public abstract class Car {

	public static Car factory(String color) {
		switch (color) {
		case "RED":
			return new RedCar();
		case "BLUE":
			return new BlueCar();
		}
		return null;
	}

	public void getDesc() {
		System.out.println("this is Car");
	}
}
