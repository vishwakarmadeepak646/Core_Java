package com.Collection.Sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e0 = new Employee(1, "Raman", 40000);
		
		System.out.println(e0);
		
		System.out.println("-------1------------------");
		
		Employee e1 = new Employee(2, "Syam", 40500);
		Employee e2 = new Employee(3, "Kapil", 50000);
		Employee e3 = new Employee(4, "Praveen",60000);
		Employee e4 = new Employee(5, "Sita", 43000);
		Employee e5 = new Employee(6, "Syam", 60000);
		
		ArrayList<Employee> li= new ArrayList<Employee>();
		
		li.add(e0);
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
				
		System.out.println(li);
		
		System.out.println("-------2--------------------");
		
		for(Object o : li) {
			System.out.println(o);
		}
				
		System.out.println("-------3--------------------");
		
		Iterator it = li.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			it.remove();
		}
		
		System.out.println("-------4---------------------");
		
		li.forEach(System.out::println);
		
	}

}