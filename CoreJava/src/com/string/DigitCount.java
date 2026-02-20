package com.string;

public class DigitCount {
	public static void main(String[] args) {
		String str = "u9sj9k3m7fj82m";
		int count = 0;
		for(int i = 0; i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i));
				count++;
			}
			
		}
		System.out.println("Total Digit Count is : " + count);
	}
}
