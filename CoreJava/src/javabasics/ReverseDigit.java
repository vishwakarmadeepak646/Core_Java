package javabasics;

public class ReverseDigit {

	public static void main(String[] args) {
		
		int n = 1203045;
		int r = 0;
		int rev = 0;
		
		while(n>0) {
		r =n%10;
		rev = rev * 10 + r;
		n = n/10;
		}
		System.out.println("Reverse number is : " + rev);
	}
	
}
