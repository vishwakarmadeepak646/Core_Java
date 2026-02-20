package javabasics;

public class SwapUsingThreeVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Swap Value of a : " + a);
		System.out.println("Swap Value of b : " + b);
	}
}
