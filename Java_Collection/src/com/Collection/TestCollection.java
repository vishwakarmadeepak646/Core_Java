package com.Collection;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollection {
	
	public static void main(String[] args) {
		
	//	Collection c = new Collection();   Not possible bcz its a interface
		
		Collection c = new ArrayList();
		
		c.add(11);
		c.add("Deepak");
		c.add(12.98);
		c.add("Vishwakarma");
		c.add(true);
		c.add("Deepak");
		
		System.out.println(c.size());
		System.out.println(c);
		System.out.println(c.contains("Deepak")); //True
		System.out.println(c.contains(false)); //false
		System.out.println(c.isEmpty());  //False as collection having 6 objects
		System.out.println(c.remove("Deepak"));
		System.out.println(c);
		
		Collection d = new ArrayList();
		
		d.add("Radha");
		d.add(78);
		d.add(18.99);
		
		c.addAll(d);
		System.out.println(c); // It will add all the elements of d in c
	//	c.clear(); // It will make it blank and print []
		System.out.println("--------------");
		System.out.println(c.containsAll(d)); //true bcz d is present in collection a
		//System.out.println(c.removeAll(d)); // Removes all elements of d that exist in another collection
		System.out.println(c.retainAll(d)); // Keeps only common elements
		System.out.println(c);
	}
}
