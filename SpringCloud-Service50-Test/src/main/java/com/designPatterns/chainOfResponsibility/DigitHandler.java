package com.designPatterns.chainOfResponsibility;

public class DigitHandler extends Handler {

	public DigitHandler(Handler next) {
		super(next);
	}

	@Override
	void handle(char c) {
		if (Character.isDigit(c)) {
			System.out.println("Digit has been handled");
		}
		doNext(c);
		System.out.println("(2)");
	}

}
