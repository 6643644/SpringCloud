package com.designPatterns.adapterPattern_class;

// 轉接器Adapter繼承自Adaptee，同時又實現了目標(Target)的接口
public class Adapter extends Adaptee implements Target {

	
	// 目標(Target)接口要求調用requset()方法，但是類別Adaptee並沒有request()方法，
	// 因此轉接器補上這個方法。
	// 但實際上request使用調用了Adaptee當中的SpecificRequest()方法。
	// 所以轉接器只是將SpecificRequest()方法封裝了一層，封裝成Target可以調用request()方法
	@Override
	public void request() {
		this.SpecificRequest();
	}

}


