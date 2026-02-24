package com.Collection.Queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		
	// 	if we insert first String the all element should be String type only. To insert int we need to create another element.
//		Does NOT allow null elements
//		1. Allows duplicate elements
//		2. Not thread-safe
//		3. Does NOT maintain insertion order
//		4. Head element = highest priority element (smallest by default)
//		
		
		Queue q = new PriorityQueue();
		
		q.add("Ram");
		q.add("Ram");
		q.add("Deepak");
		q.add("Akash");
		q.add("Radha");
		q.add("Rani");
	//	q.add(null); // lang.NullPointerException
		
	//	q.add(5);  // runtime exception ClassCastException
		
		System.out.println(q);

	}

}
