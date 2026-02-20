package javabasics;

public class Palindrome {
	public static void main(String[] args) {
		int n = 13391;
		int r = 0;
		int rev = 0;
		int match = n;

		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;

		}

		if (match == rev) {
			System.out.println("This is a Palindrom Number : " + rev);
		} else {
			System.out.println("This is not a Palindrom Number : " + rev);
		}

	}
}
