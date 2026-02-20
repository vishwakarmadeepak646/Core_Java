package com.polymorphisms;

public class BankTest2_ArraysPoly {

	public static void main(String[] args) {
		
		// Using Polymorphism in Arrays
		
		Bank [] b1 = new Bank[3];
		b1[0] = new AxisBank();
		b1[1] = new ICICIBank();
		b1[2] = new HDFCBank();
		
		for(int i = 0; i<b1.length; i++) {
			
			System.out.println(b1[i].getName());
			System.out.println(b1[i].interetRate());
			
			System.out.println("----------------------------");
		}
		
	}
}
