package com.Collection.List;

import java.util.Vector;
public class TestVector {

	// Vector increase double of it's size.
	// Thread safe.
	// Slow Performance

	public static void main(String args[]) {
		
		Vector v = new Vector();
		
		v.addElement("Ram"); // Vector method
		v.addElement(67);
		v.addElement(true);
		v.add("Syam"); 		 // Collection method
		
		System.out.println(v.elementAt(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
	}
}
