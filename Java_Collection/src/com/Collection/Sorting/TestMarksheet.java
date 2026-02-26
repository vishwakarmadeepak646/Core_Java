package com.Collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet("101", "Deepak", 96);
		Marksheet m2 = new Marksheet("109", "Ram", 99);
		Marksheet m3 = new Marksheet("104", "Shyam", 78);
		Marksheet m4 = new Marksheet("102", "Kapil", 76);
		Marksheet m5 = new Marksheet("111", "Ramal", 46);
		Marksheet m6 = new Marksheet("105", "Kisan", 92);
		
		List<Marksheet> list = new ArrayList<Marksheet>();	
		
		list.add(m1);
		list.add(m2);
		list.add(m6);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		System.out.println(list);
		
		System.out.println("--------------------------------");
		
		Collections.sort(list);  // Method to sort using Comparable Interface and ToComparable method
		
		list.forEach(System.out::println);
		
		
	}
}
