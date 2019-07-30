package com.designPatterns.builderPattern2;

public class Client {

	public static void main(String[] args) {

		Director director = new Director();

		Builder builder = new ConcreteBuilder();
		
		director.construct(builder);
		
		Computer computer = builder.GetComputer();
		
		computer.Show();

	}

}
