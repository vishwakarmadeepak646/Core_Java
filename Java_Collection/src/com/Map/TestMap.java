package com.Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

//	 1. Map working in key and value pair.
//	 2. Map does not contain duplicate key.
//	 3. Map contain only one null key.
//	 4. Map can contain multiple null value.
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put(5, "five");
		
		System.out.println(m.get(5));    // five
		System.out.println(m.entrySet()); // [5=five, four=4, one=1, two=2, three=3]
		System.out.println(m.containsKey(5));  //True
		System.out.println(m.containsValue(5)); // False
		System.out.println(m.keySet()); 	//	[5, four, one, two, three]
		System.out.println(m.values());   //[five, 4, 1, 2, 3]
		
	}
}
