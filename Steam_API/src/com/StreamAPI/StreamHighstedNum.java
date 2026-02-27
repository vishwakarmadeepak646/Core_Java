package com.StreamAPI;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class StreamHighstedNum {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(2000);
		li.add(4534);
		li.add(3220);
		li.add(1000);
		li.add(4);
		li.add(2900);
		li.add(5000);
		
		System.out.println("-----------Largest Number from above List :--------------");
		li.stream().distinct().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
		
		System.out.println("-------------Second Largest Number ----------------------");
	
		li.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
	}

}
