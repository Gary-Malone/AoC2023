package garyMalone.com.Objects;

public class CubeGame {
	
	public int id;
	public int maximumGreen = 0;
	public int maximumRed 	= 0;
	public int maximumBlue	= 0;
	
	public void populateCubeGame(String input) {
		String gameString[] = input.split(":");
		parseGameId(gameString[0]);
		parseMaxCubes(gameString[1]);
	}
	
	public void parseGameId(String str){
		 setId(Integer.parseInt(str.replaceAll("[^\\d]", "")));
	}
	
	public void parseMaxCubes(String str) {
		String cubeGames[] = str.split(";");
		for(String cubeGame : cubeGames) {
			String cubeStrings[] = cubeGame.split(",");
			for(String cubeStr : cubeStrings) {
				int number = Integer.parseInt(cubeStr.replaceAll("[^\\d]", ""));
				if(cubeStr.toLowerCase().endsWith("green") && isNumberGreaterThanGreen(number)) {
					this.maximumGreen = number;
				}
				else if(cubeStr.toLowerCase().endsWith("red") && isNumberGreaterThanRed(number)) {
					this.maximumRed = number;
				}
				else if(cubeStr.toLowerCase().endsWith("blue") && isNumberGreaterThanBlue(number)) {
					this.maximumBlue = number;
				}
			}
		}
	}
	
	private boolean isNumberGreaterThanGreen(int number) {
		return number > maximumGreen;
	}
	
	private boolean isNumberGreaterThanRed(int number) {
		return number > maximumRed;
	}
	
	private boolean isNumberGreaterThanBlue(int number) {
		return number > maximumBlue;
	}
	
	public boolean isGamePossible(int allowedGreen, int allowedRed, int allowedBlue) {
		return this.maximumGreen <= allowedGreen && this.maximumRed <= allowedRed && this.maximumBlue <= allowedBlue;
	}
	
	public int getCubePower() {
		return this.maximumGreen * this.maximumRed * this.maximumBlue;
	}
	
	public void printCubes() {
		System.out.println("game " + this.id + ": red: " + this.maximumRed + " blue: " + this.maximumBlue + " green: " + this.maximumGreen);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getMaximumGreen() {
		return maximumGreen;
	}
	
	public void setMaximumGreen(int maximumGreen) {
		this.maximumGreen = maximumGreen;
	}
	
	public int getMaximumRed() {
		return maximumRed;
	}
	
	public void setMaximumRed(int maximumRed) {
		this.maximumRed = maximumRed;
	}
	
	public int getMaximumBlue() {
		return maximumBlue;
	}
	
	public void setMaximumBlue(int maximumBlue) {
		this.maximumBlue = maximumBlue;
	}
	
	
}
