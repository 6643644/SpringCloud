package com.designPatterns.chainOfResponsibility;

public class CharacterHandler extends Handler {

	public CharacterHandler(Handler next) {
		super(next);
	}

	@Override
	void handle(char c) {
		if (Character.isLetter(c)) {
			System.out.println("Character has been handled");
		}
		doNext(c);
		System.out.println("(3)");
	}

}
