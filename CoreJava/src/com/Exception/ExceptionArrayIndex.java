package com.Exception;

public class ExceptionArrayIndex {

	public static void main(String[] args) {
		
		String [] str = {"Deepak", "Vishwakarma"};
		
		try {
		System.out.println(str.length);
		System.out.println(str[3]);
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program Executed till the End");
	}
	
}
