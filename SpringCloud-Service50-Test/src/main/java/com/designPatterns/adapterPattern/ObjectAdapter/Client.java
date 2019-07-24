package com.designPatterns.adapterPattern.ObjectAdapter;

public class Client {

	public static void main(String[] args) {

		String original = new String("I like foreach!");
		for (char c : new IterableString(original)) {
			System.out.println(c);
		}

	}

}
