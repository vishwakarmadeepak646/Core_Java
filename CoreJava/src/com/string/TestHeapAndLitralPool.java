package com.string;

public class TestHeapAndLitralPool {

	public static void main(String[] args) {
		
		String str1 = "Deepak";
		String str2 = "Deepak";
		
		String str3 = new String("Vishwakarma");
		String str4 = new String("Vishwakarma");
		
			System.out.println(str1==str2); //True
			
			System.out.println(str1.equals(str2)); //True
			
			System.out.println(str3==str4); //False
			
			System.out.println(str3.equals(str4)); //True
	}
}
