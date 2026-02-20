package com.string;

public class CountCharString {
	public static void main(String[] args) {
		String str = "Google";
		int count = 0;
		char opr = 'o';

		for (int i = 0; i < str.length(); i++) {
			if (opr == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("Char 'o' count is: " + count);
	}
}
