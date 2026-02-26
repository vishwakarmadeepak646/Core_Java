package com.Collection.Sorting;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee> {
	
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name); // For ASC need to put fist object(o1.name) first.
		
	//  return o2.name.comparaTo(o1.name); // 	for DESC need to put second object(o2.salary) First.
		
		
	}

}
