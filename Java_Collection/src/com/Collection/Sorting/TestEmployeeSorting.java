package com.Collection.Sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeSorting {
	public static void main(String[] args) {

		Employee e1 = new Employee(11, "Deepak", 100000);
		Employee e2 = new Employee(14, "Ram", 200000);
		Employee e3 = new Employee(13, "Radhe", 50000);
		Employee e4 = new Employee(16, "Kapil", 300000);
		Employee e5 = new Employee(17, "Kanisk", 150000);
		Employee e6 = new Employee(19, "Janak", 120000);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e6);
		list.add(e5);
		list.add(e4);
		list.add(e3);
		
		OrderByIdASC id = new OrderByIdASC();
		//Collections.sort(list, id);
		
		OrderByIdDESC id2 = new OrderByIdDESC();
		Collections.sort(list,id2);
		
		list.forEach(System.out::println);
		
		OrderByName n = new OrderByName();
		Collections.sort(list,n);
		
		OrderBySalary  s = new OrderBySalary();
		Collections.sort(list, s);
		
		//list.forEach(System.out::println);

	}

}
