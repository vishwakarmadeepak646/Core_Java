package com.Abstraction;

public class TestBusniessMan {
	
	public static void main(String[] args) {
		
	Richman r = new BusinessMan();
	Richman r1 = new BusinessMan();
	BusinessMan b = new BusinessMan();
	
	r.donation();
	r.earnMoney();
	r.party();
	
	System.out.println("--------------------------");

	r1.donation();
	r1.earnMoney();
	r1.party();
	
	System.out.println("--------------------------");
	
	b.helpToOthers();
	}
}
