package com.designPatterns.builderPattern;

public interface MazeBuilder {
	public void buildRoad(int i,int j); //綁定路面
	public void buildWall(int i,int j); //綁定牆壁
	public void buildTreasure(int i,int j); //綁定寶藏
	Maze getMaze();
	
}
