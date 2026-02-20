package com.Abstraction;

public class BusinessMan implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("Business Man help to others");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earning the money");
		
	}

	@Override
	public void party() {
		System.out.println("Doing the party");
		
	}

	@Override
	public void donation() {
		System.out.println("Business donate the money");
		
	}

}
