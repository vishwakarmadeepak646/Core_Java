package com.java__Features;

//Anonymous function is use to create Interface and FunctionalInterface instance.
public class TestHelloFunctionalInterface {

	public static void main(String[] args) {

		HelloFunctionalInterface a = new HelloFunctionalInterface() {

			@Override
			public void say() {

				System.out.println("This is Anonymous function");

			}

		};
		
		a.say();

	}

}
