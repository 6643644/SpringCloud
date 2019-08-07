package com.designPatterns.chainOfResponsibilityPattern;

public class SymbolHandler extends Handler {

	SymbolHandler(Handler next) {
		super(next);

	}

	@Override
	void handle(char c) {
		System.out.println("(1)");
		System.out.println("Symbol has been handled");
		doNext(c);
		
	}

}
