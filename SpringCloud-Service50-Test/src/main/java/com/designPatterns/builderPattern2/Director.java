package com.designPatterns.builderPattern2;

public class Director {

	public void construct(Builder builder) {
		builder.buildCPU();
		builder.buildMainboard();
		builder.buildHD();
	}

}
