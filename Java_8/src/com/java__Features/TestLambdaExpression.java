package com.java__Features;

// Lambda expression is used to create only Functional instance.
public class TestLambdaExpression {

	public static void main(String[] args) {
		HelloFunctionalInterface fi = () -> {
			System.out.println("This is Functional Interface using Lambda expression");
		};
		
		fi.say();
	}
	
}
