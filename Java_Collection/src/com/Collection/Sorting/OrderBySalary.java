package com.Collection.Sorting;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee>{

	


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
	//	return o1.salary - o2.salary; // For ASC need to put fist object(o1.salary) first.
		return o2.salary -  o1.salary; // for DESC need to put second object(o2.salary) First.
		
		// if not prefer above two return statement then create another class with OrderBySalaryDESC
	}
}