package com.StreamAPI;

import java.util.List;
import java.util.ArrayList;

public class PrimeNumberStream {

	public static Boolean isPrime(int i) {
		
		int count = 0;
		if(i == 0) {
			return false;
		}
		
		for(int j = 2; j<i; j++) {
			
			if(i%j == 0) {
				count++;
			}
		}
			
			if(count>0) {
				return false;
			}
			return true;
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		for(int i = 0; i< 25 ;i++) {
			li.add(i);
		}
		
		System.out.println("Prime Number : ");
		li.stream().filter(e -> isPrime(e)).skip(1).forEach(System.out::println);
	}
}
