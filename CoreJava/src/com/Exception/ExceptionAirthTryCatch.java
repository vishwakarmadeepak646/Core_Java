package com.Exception;

public class ExceptionAirthTryCatch {

	public static void main(String[] args) {

		int a = 8;
		int b = 0;
		try {

			int c = a / b;
			System.out.print("c : " + c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program executed till End");
	}
}
