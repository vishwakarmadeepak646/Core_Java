package com.string;

public class ReverseStringAtSamePlace {

	public static void main(String[] args) {

		String str = "Rays Technology";
		String[] words = str.split(" ");

		for (String word : words) {

			String reversedWord = " ";

			for (int i = 0; i < word.length(); i++) {
				reversedWord = word.charAt(i) + reversedWord;
			}
			System.out.println(reversedWord + " ");

		}

	}
}
