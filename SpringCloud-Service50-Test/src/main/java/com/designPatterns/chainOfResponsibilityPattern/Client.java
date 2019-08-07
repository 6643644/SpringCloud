package com.designPatterns.chainOfResponsibilityPattern;

public class Client {

	public static void main(String[] args) {

		// 檢核順序隨時更換 
		// 先給SymbolHandler檢察，再給DigitHandler，最後給CharacterHandler
		Handler handler = new SymbolHandler(new CharacterHandler(new DigitHandler(null)));
		

//		handler.handle('A');

		handler.handle('1');

	}

}
