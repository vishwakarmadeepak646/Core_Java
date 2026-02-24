package com.Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {

	public static void main(String[] args) {
		
		List li = new ArrayList();
		
		li.add(0, 89);
		li.add(1,"Deepak");
		li.add(2, "Vishwakarma");
		li.add(1, "Sagar");  // As we are adding here object in list so rest object index shift to next index.
		
		System.out.println(li);
		
		System.out.println("---------------Iterator Fail Fast---------------------");
		
		Iterator it = li.iterator();
		
		// li.add("Indore");     //Fail Fast ConcurrentModificationException
		System.out.println(li);
		
		while(it.hasNext()) {
		//	li.add("Ram");     ----> ConcurrentModificationException
			System.out.println(it.next());
			it.remove();  // Remove from collection
		}

		System.out.println(li);
		
	}

}
