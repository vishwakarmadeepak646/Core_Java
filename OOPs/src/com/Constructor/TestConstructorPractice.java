package com.Constructor;

public class TestConstructorPractice {

	public static void main(String[] args) {
		
		ConstructorPractice c = new ConstructorPractice();
		
		ConstructorPractice c2 =  new ConstructorPractice("Deepak", 100000);
		
		System.out.println(c2.getBalance());
		System.out.println(c2.getName());
	}
}
