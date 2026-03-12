package com.java__Features;

public class TestSumFunctionalInterface {

	public static void main(String[] args) {
		
		System.out.println("-----------anoymous function------------------");
		
		SumFunctionalInterface s = new SumFunctionalInterface() {

			@Override
			public int sum(int i, int j) {
				int c = i + j;
				return c;
			}
			
		};
		System.out.println(s.sum(12, 10));
		
		System.out.println("------------------Lembda Expression-----------------");
		
		SumFunctionalInterface s2 = (a, b) ->{
			return a+b;
		};
		
		System.out.println(s2.sum(3, 2));
	}
}
