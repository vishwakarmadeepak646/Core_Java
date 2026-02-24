package com.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class TestEnumeration {  // This works on historical collection

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement("Ram");
		v.add("Syam");
		v.add(89);
		v.add(67.8);
		v.add(89);
		
		System.out.println(v);
		
		System.out.println("--------------Enumeration---------------");
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			
			Object o = e.nextElement();
			System.out.println(o);
		}
		
		System.out.println("Vector : " + v);
		
	}
}
