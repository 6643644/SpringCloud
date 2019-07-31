package com.designPatterns.builderPattern2;

public class Director {
	public Human createHumanByDirecotr(IBuildHuman bh) {
		bh.buildBody();
		bh.buildFoot();
		bh.buildHand();
		bh.buildHead();
		return bh.createHuman();
	}
}
