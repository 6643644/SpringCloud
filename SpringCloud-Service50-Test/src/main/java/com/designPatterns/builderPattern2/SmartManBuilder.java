package com.designPatterns.builderPattern2;

public class SmartManBuilder implements IBuildHuman {

	private Human human;

	public SmartManBuilder() {
		human = new Human();
	}

	@Override
	public void buildHead() {
		human.setHead("智商180的头脑");

	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildHand() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub

	}

	@Override
	public Human createHuman() {
		// TODO Auto-generated method stub
		return null;
	}

}
