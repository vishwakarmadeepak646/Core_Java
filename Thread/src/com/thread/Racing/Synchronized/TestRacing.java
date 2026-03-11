package com.thread.Racing.Synchronized;

public class TestRacing {

	public static void main(String[] args) {
		
		Racing t1 = new Racing("Deepak");
		
		Racing t2 = new Racing("Radha");
		
		t1.start();
		t2.start();
	}
}
