package com.Collection;

import java.util.Vector;
import java.util.Enumeration;

public class TestFailSafe {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(0, 23);
		v.add(1, 24);
		v.add("Deepak");
		v.add(3, "Vishwakarma");
		v.add(4, "Indore");
		
		System.out.println(v.size());
		System.out.println(v);
		
		System.out.println("------------------Enumeration--------------------");
		
		Enumeration e = v.elements();
		
		v.add(5,"Deepak");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("Vector : " + v);
		

	}

}
