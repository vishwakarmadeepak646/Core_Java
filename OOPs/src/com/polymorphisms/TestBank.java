package com.polymorphisms;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		System.out.println(b1.getName());
		System.out.println(b1.interetRate());
		
		System.out.println("--------------------------------------");
		
		Bank b2 = new HDFCBank();
		
		System.out.println(b2.getName());
		System.out.println(b2.interetRate());
		
		System.out.println("---------------------------------------");
		
		Bank b3 = new AxisBank();
		System.out.println(b3.getName());
		System.out.println(b3.interetRate());
		
		System.out.println("---------------------------------------");
		
		Bank b4 = new ICICIBank();
		System.out.println(b4.getName());
		System.out.println(b4.interetRate());

	}

}
