package com.Collection.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	// It will follow all the set rule and below rule
	// sorted set is order set in ascending order
	
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add('a');
		s.add('b');
		s.add('c');
		s.add('a');
		s.add('a');
		
		System.out.println(s);  // [a, b, c]


	}

}
