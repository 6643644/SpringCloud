package com.designPatterns.adapterPattern_class;

public class Client {

	public static void main(String[] args) {
		Target mAdapter = new Adapter();
		mAdapter.request();
	}

}


