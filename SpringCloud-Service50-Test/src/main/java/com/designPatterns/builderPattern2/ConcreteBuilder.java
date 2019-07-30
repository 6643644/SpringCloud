package com.designPatterns.builderPattern2;

public class ConcreteBuilder extends Builder {

	Computer computer = null;

	public ConcreteBuilder(String name, String os) {
		computer = new WindowComputer(name, os);
	}

	@Override
	public void buildCPU(String cpu) {
		computer.setCPU(cpu);

	}

	@Override
	public void buildMainboard(String main) {
		computer.setMainboard(main);

	}

	@Override
	public void buildHD(String hd) {
		computer.setHD(hd);

	}

	@Override
	public Computer GetComputer() {
		return computer;
	}

}
