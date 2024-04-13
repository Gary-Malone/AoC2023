package garyMalone.com.Days;

import garyMalone.com.Objects.CubeGame;
public class Day2 {
	
	private static final int MAX_GREEN = 13;
	private static final int MAX_RED = 12;
	private static final int MAX_BLUE = 14;
	
	public static int part1(final String[] input) {
		int total = 0;
		for(String str : input) {
			str = str.trim();
			CubeGame game = new CubeGame();
			game.populateCubeGame(str);
			if(game.isGamePossible(MAX_GREEN, MAX_RED, MAX_BLUE)) {
				total += game.getId();
			}
		}
		
		return total;
	}
	
	public static int part2(final String[] input) {
		int total = 0;
		for(String str : input) {
			str = str.trim();
			CubeGame game = new CubeGame();
			game.populateCubeGame(str);
			total += game.getCubePower();
		}
		
		return total;
	}
	
}
