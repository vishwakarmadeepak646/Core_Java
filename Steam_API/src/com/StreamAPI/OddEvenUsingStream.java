package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class OddEvenUsingStream {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		for (int i = 0; i < 13; i++) {
			
			li.add(i);
		}
		
		li.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.println("odd : " + e));
		
		System.out.println("---------------------");
		
		li.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("Even : " + e));
	}
}
