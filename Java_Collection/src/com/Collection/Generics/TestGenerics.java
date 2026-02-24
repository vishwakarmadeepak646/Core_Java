package com.Collection.Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGenerics {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();

		li.add("Deepak");
		li.add("Vishwakarma");
	//	li.add(56); // As we have mentioned explicitly String in List, So it will store only String
					// type of date for other data it will throw compilation Error
		li.add("Indore");

		System.out.println(li);
		
		System.out.println("-----------------------------------------------");
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(0, "Collection");
		m.put(1, "FrameWork");
	//	m.put("three", 2);  // Compilation Error
		m.put(3, null);
		m.put(4, "Java");
		System.out.println(m);
	}

}
