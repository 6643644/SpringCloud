package com.designPatterns.builderPattern2;

public interface IBuildHuman {

	public void buildHead();

	public void buildBody();

	public void buildHand();

	public void buildFoot();

	public Human createHuman();

}
