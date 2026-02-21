package com.Exception;

public class CheckedException {

	public static void main(String[] args) {

		try {

			throw new Exception();

		} catch (Exception e) { // Checked Exception try catch block are mandatory

			System.out.println(e.getMessage());

		}
		System.out.println("Hello");
		
		throw new RuntimeException(); // Unchecked Exception try catch block is optional
	
	}

}

