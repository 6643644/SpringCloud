package com.designPatterns.chainOfResponsibility;

public class Client {

	public static void main(String[] args) {

		// 檢核順序隨時更換
		Handler handler = new SymbolHandler(new DigitHandler(new CharacterHandler(null)));
		

		handler.handle('A');

//		handler.handle('1');

	}

}
