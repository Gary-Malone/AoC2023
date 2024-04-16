package garyMalone.com.Days;

public class Day3 {
	
	public static int part1(String[] input) {
		int total = 0;
		
		for (int y = 0; y < input.length; y++) {
			String str = input[y].trim();
			for (int x = 0; x < str.length(); x++) {
				if(isDigit(str.charAt(x))) {
					String potentialNumber = getPotentialPartNumber(str, x);
					if(isPotentialNumberValid(potentialNumber, x, y, input)) {
						total += Integer.parseInt(potentialNumber);
					}
					x += potentialNumber.length();
				}
				
			}
		}
		
		return total;
	}
	
	public static void part2(final String[] input) {
	
	}
	
	
	private static String getPotentialPartNumber(String str, int initalIndex) {
		String partNumber = "";
		char c = str.charAt(initalIndex);
		while(isDigit(c)) {
			partNumber += c;
			initalIndex++;
			if(initalIndex > str.length()-1) break;
			c = str.charAt(initalIndex);
		}
		return partNumber;
		
	}
	
	private static boolean isPotentialNumberValid(String potentialNumber, int initialX, int initialY, String[] input) {
		
		int maximumX;
		int maximumY;
		if((initialX + potentialNumber.length() + 1) > (input[0].length() - 1)) {
			maximumX = input[0].length()-1;
		}
		else {
			maximumX = initialX + potentialNumber.length() + 1;
		}
		
		if(initialY + 1 > input.length-1) {
			maximumY = input.length-1;
		}
		else {
			maximumY = initialY + 1;
		}
		
		if(initialX > 0) {
			initialX = initialX - 1;
		}
		
		if(initialY > 0) {
			initialY = initialY - 1;
		}
		
		for(int y = initialY; y <= maximumY; y ++) {
			String str = input[y];
			for(int x = initialX; x < maximumX; x++) {
				char c = str.charAt(x);
				if(isPartNumberSymbol(c)){
					return true;
				}
			}
			
		}
		
		
		return false;
	}
	
	private static boolean isDigit(char c){
		return ((c>='0') && (c<='9'));
	}
	
	private static boolean isPartNumberSymbol(char c) {
		return c != '.' && !isDigit(c);
	}
}
