package com.Collection.Sorting;

import java.util.Comparator;

public class OrderByIdDESC  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.id - o1.id;
	}
	

}
