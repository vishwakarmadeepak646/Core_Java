package com.Constructor;

public class ConstructorPractice {

	private String name;
	private double balance;

	// default Constructor | Constructor does not have any return type

	public ConstructorPractice(){

		System.out.println("This is default Constructor | Parent Class");
	}

	public ConstructorPractice(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
}
