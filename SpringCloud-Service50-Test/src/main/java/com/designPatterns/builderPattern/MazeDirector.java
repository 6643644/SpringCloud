package com.designPatterns.builderPattern;

public class MazeDirector {
	private int[][] maze;
	private MazeBuilder builder;

	MazeDirector(int[][] maze, MazeBuilder builder) {
		this.maze = maze;
		this.builder = builder;
	}

	public Maze build() {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				switch (maze[i][j]) {
				case 0:
					builder.buildRoad(i, j);
					break;
				case 1:
					builder.buildWall(i, j);
					break;
				case 2:
					builder.buildTreasure(i, j);
					break;
				}
			}
		}
		return builder.getMaze();
	}
}
