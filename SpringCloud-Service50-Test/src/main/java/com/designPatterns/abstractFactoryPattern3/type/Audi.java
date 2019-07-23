package com.designPatterns.abstractFactoryPattern3.type;

public abstract class Audi {

	private String brand;
	private String type;

	public Audi() {
		this.brand = "Audi";
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}
}
