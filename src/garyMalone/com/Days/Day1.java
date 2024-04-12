package garyMalone.com.Days;

public class Day1 {
	
	public static long part1(final String[] input) {
		long total = 0L;
		for (String str : input) {
			str = str.trim();
			str = str.replaceAll("[^\\d]", "");
			
			char digit1 = str.charAt(0);
			char digit2 = str.charAt(str.length()-1);
			
			String numberStr = "" + digit1 + digit2;
			long number = Long.parseLong(numberStr);
			total = total + number;
		}
		return total;
	}
	
	public static long part2(final String[] input) {
		long total = 0L;
		for (String str : input) {
			char digit1 = '0';
			char digit2 = '0';
			str = str.trim();
			
			//digit 1
			for (int i = 0; i < str.length(); i++) {
				if(isDigit(str.charAt(i))){
					digit1 = str.charAt(i);
					break;
				}
				else {
					digit1 = getWordDigit(str.substring(i));
					if(digit1 > '0') break;
				}
			}
			
			//digit 2
			for (int i = str.length()-1; i >= 0; i--) {
				if(isDigit(str.charAt(i))){
					digit2 = str.charAt(i);
				}
				else {
					digit2 = getWordDigit(str.substring(i));
				}
				if(digit2 > '0') break;
			}
			
			String numberStr = "" + digit1 + digit2;
			long number = Long.parseLong(numberStr); total = total + number;
		}
		
		return total;
	}
	
	private static boolean isDigit(char c) {
		return (c > '0') && (c <= '9');  
	}
	
	private static char getWordDigit(String str) {
		if(str.startsWith("one")) 	return '1';
		if(str.startsWith("two")) 	return '2';
		if(str.startsWith("three")) return '3';
		if(str.startsWith("four")) 	return '4';
		if(str.startsWith("five")) 	return '5';
		if(str.startsWith("six")) 	return '6';
		if(str.startsWith("seven")) return '7';
		if(str.startsWith("eight")) return '8';
		if(str.startsWith("nine")) 	return '9';
		return 0;
	}
}
