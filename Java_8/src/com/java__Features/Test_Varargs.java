package com.java__Features;

public class Test_Varargs {

// int... is called Varargs (Variable Arguments)
//	Introduced in Java 5
//	Internally treated as an array
//	Allows passing 0 or more arguments

	public static void main(String[] args) {
		getInts(1, 2, 3, 4, 5);
	}

	public static void getInts(int... i) {
		for (int a : i) {
			System.out.println(a);
		}
	}
}

// int... represents varargs in Java, which allows a method to accept variable number of arguments, internally treated as an array.