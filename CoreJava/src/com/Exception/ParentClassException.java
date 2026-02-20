package com.Exception;

public class ParentClassException {
	
	public static void main(String[] args) {
		
	String str = "Deepak Vishwakarma";
	String [] str1 = {"Deepak ", "Vishwakarma", "Sagar"};
	
	try {
		System.out.println(str1[5]);
		System.out.println(str.charAt(20));
		
		
	}catch(Exception e){   					// Exception e we used as a parent class if any exception is coming it will handle as it is a parent class
		System.out.println(e.getMessage());
	} finally {
		System.out.println("This is finally block. It will alway execute");
	}
		// try , catch and finally blocks this is the correct sequence
	}
}
