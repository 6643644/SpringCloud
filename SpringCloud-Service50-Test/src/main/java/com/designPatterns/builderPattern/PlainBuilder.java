package com.designPatterns.builderPattern;

public class PlainBuilder implements MazeBuilder {

	private char[][] maze;

	public PlainBuilder(int i, int j) {
		this.maze = new char[i][j];
	}

	@Override
	public void buildRoad(int i, int j) {
		maze[i][j] = ' ';

	}

	@Override
	public void buildWall(int i, int j) {
		maze[i][j] = '□';

	}

	@Override
	public void buildTreasure(int i, int j) {
		maze[i][j] = '★';

	}

	@Override
	public Maze getMaze() {
		return new Maze() {
			@Override
			public void paint() {
				for (char[] row : maze) {
					for (char ele : row) {
						System.out.print(ele);
					}
					System.out.println();
				}
			}
		};
	}

}
