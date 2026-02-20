package com.polymorphisms;

public class BankTest3ArraysMethodArg {
	
	public static void main(String[] args) {
		
	// Using polymorphism for Method Arguments
	
	Bank [] b = new Bank[3];
	
	b[0] = new HDFCBank();
	b[1] = new ICICIBank();
	b[2] = new AxisBank();
	
	loanEnqury(b);
		
	}
	
	public static void loanEnqury(Bank[] b) {
		
		for(int i =0; i<b.length ; i++) {
			
			System.out.println("Bank Name : " + b[i].getName());
			System.out.println("Rate of Interest : " +b[i].interetRate());
			
			System.out.println("----------------------------");
		}
	}
}
