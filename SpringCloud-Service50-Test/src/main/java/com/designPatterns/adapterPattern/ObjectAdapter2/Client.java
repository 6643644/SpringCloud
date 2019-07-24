package com.designPatterns.adapterPattern.ObjectAdapter2;

public class Client {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeek();
		p.printStrong();

	}

}
