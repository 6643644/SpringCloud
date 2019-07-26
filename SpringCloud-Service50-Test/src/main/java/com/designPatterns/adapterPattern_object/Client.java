package com.designPatterns.adapterPattern_object;

public class Client {

	public static void main(String[] args) {
		//需要先创建一个被适配类的对象作为参数  
		Target mAdapter = new Adapter(new Adaptee());
		mAdapter.request();

	}

}
