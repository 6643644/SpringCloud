package com.designPatterns.factoryMethodPattern;

public class FrenchFries implements Product {

	//預設有鹽巴的
	String state = "有鹽巴";

	//預設的建構
	protected FrenchFries() {
	}

	//帶入狀態的建構
	protected FrenchFries(String state) {
		this.state = state;
	}

	@Override
	public void describe() {
		System.out.println("我是" + state + "薯條");
	}

}
