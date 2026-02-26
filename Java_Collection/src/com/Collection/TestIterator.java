package com.Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
	
		List li = new ArrayList();  // This works on all collection
		
		li.add("Deepak");
		li.add("Vishwakarma");
		li.add(true);
		li.add(23.45);
		li.add(123);
		
		System.out.println(li);
		
		System.out.println("---------------------------");

		Iterator r = li.iterator();
		
		while(r.hasNext()) { 				//hasNext() ---return boolean value only true or false
			System.out.println(r.next());   //r.next() ---- It will print the value
 			r.remove();
		}
		
		System.out.println("---------------------------");
		System.out.println(li);
	}

}
