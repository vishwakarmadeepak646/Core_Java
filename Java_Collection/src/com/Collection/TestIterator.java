package com.Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
	
		List li = new ArrayList();  // This works on all collection
		
		li.add("Deepak");
		li.add("Vishwakarma");
		li.add(12);
		li.add(23.45);
		li.add(true);
		
		System.out.println(li);
		
		System.out.println("---------------------------");

		Iterator r = li.iterator();
		
		while(r.hasNext()) {
			System.out.println(r.next());
			r.remove();
		}
		
		System.out.println("---------------------------");
		System.out.println(li);
	}

}
