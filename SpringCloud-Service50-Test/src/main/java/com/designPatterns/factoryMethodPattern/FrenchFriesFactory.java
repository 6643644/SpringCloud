package com.designPatterns.factoryMethodPattern;

public class FrenchFriesFactory implements Factory {

	//返回一般的薯條
    @Override
    public Product getProduct() {
        return new FrenchFries();
    }

    //返回我們想要的狀態的薯條..
    public Product getProduct(String state) {
        return new FrenchFries(state);
    }

}
