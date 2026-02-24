package com.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	// 1. Set contain only unique elements
	// 2. Set contain only one null value.
	// 3. Order of set is not define

	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(null);
		s.add(null); // As Set only store one null value so it will not store another null
		s.add('a');
		s.add('b');
		s.add('c');
		s.add('d');
		s.add('e');
		s.add('f');
		s.add('a'); // As this is a set, So it can't store duplicate values
		s.add('a');
		s.add('a');
		
		System.out.println(s); // [null, a, b, c, d, e, f]

		
		
		
		
	}
}
