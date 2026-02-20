package com.string;

public class StringBufferExp {

	public static void main(String[] args) {
		String str1 = "Deepak Vishwakarma";
		//String object is Mutable. We can not change it's value. 
		System.out.println( "String object is Mutable. We can not change it's value." );
		System.out.println(str1);
		System.out.println(str1.replace('e', 'Z')); // It is changed on  Run Time but once we print str1 again then getting the same value
		System.out.println(str1);
		
		System.out.println("--------------------------------------");
		
		// By using StringBuffer we can change the value of String
		
		StringBuffer s = new StringBuffer("Deepak Vishwakarma");
		System.out.println(s);
	
		System.out.println(s.append(" Sagar")); // Here in we append String with Sagar then it's original String is changed see the o/p
		System.out.println(s);
	}
}
