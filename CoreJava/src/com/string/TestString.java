package com.string;

public class TestString {
	public static void main(String[] args) {
		String name = "Vijay Dinanath chouhan";
		
		 String a = new String("Vijay Dinanath chouhan");
		
		
		 
		 System.out.println("Lengh of name : "+name.length());
		 
		 System.out.println("Character at 6th : " + name.charAt(6));
		 
		 System.out.println("Index of 'chouhan' : " + name.indexOf("chouhan"));
		 
		 System.out.println("First Index of 'a' : " + name.indexOf('a'));
		 
		 System.out.println("Last index of 'a' : " + name.lastIndexOf('a'));
		 
		 System.out.println("Replace 'a' with 'D' " + name.replace('a','D'));
		 
		 System.out.println("Convert to Lower Case : " + name.toLowerCase());
		 
		 System.out.println("Convert to Upper Case : " + name.toUpperCase());
		 
		 System.out.println("Start with 'Vijay' : " + name.startsWith("Vijay")); // Output will be true or false
		 
		 System.out.println("End with 'han' : " + name.endsWith("ha")); // Output will be true or false
		 
		 System.out.println("Name of substring from index 6 : " + name.substring(6));
	}

}
