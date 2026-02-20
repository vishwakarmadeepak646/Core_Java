package javabasics;

public class SwapUsingTwoVariable {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		a = a+b; //a = 15
		b = a-b; //a = 9;
		a = a -b;
		
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	}
}
