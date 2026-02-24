package com.Collection.List;

import java.util.List;
import java.util.ArrayList;

public class TestList {

	// 1. list can contain duplicate elements
	// 2. list can contain multiple null elements
	// 3. Order of list is natural order.

	public static void main(String[] args) {

		List li = new ArrayList();

		li.add(0, "Deepak");
		li.add(1, 5000);
		li.add(2, "Apple"); // if we put kapil on 2nd index but on 2nd index one value is already there, in
		li.add(2, "kapil"); // that case 2nd index existing value move to 3rd index.
		System.out.println(li); // [Deepak, 5000, kapil, Apple]

		li.add(4, 67.87);

		System.out.println(li.get(0)); // Deepak
		System.out.println(li.get(2)); // Kapil
		System.out.println(li.get(3)); // Apple
		li.remove(1); // 5000 will remove

		System.out.println(li.set(0, "Vishwakarma")); // it will remove deepak and put VIshwakarma on 0th index but in
														// o/p it print Deepak (remove object)
		System.out.println(li);
		System.out.println(li.indexOf("hj")); // it will print index of element, if element is not present then print -1
		System.out.println(li);
		
		System.out.println(li.lastIndexOf("kapil"));
		
		System.out.println(li.subList(0, 3));  // it will print element till (last index - 1)
	}
}
