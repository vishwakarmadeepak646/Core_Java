package com.thread.Racing;

public class Racing extends Thread{

	String name = null;
	
	public static Account ac = new Account();  // Here we make object as static so only once memory will assign during runtime.
	
	public Racing(String name) {
		this.name = name;
	}
	
	public  void run() {
		for(int i =1; i<=5; i++) {
			ac.deposit(name, 1000);
		}
	}
	
}
