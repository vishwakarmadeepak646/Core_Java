package com.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

// It follow FIFO

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		for (char c = 'a'; c <= 'z'; c++) {
			q.offer(c);
		}

		q.offer(5);
		q.offer(5.8);

		System.out.println(q);

		System.out.println("First Element : " + q.peek()); // peek() is used to saw the element name, It will not
															// perform any action

		System.out.println(q);

		System.out.println("First Element to be remove : " + q.poll());

		System.out.println(q);
	}
}
