package com.thread.Racing.Synchronized;

public class Racing extends Thread{

	public static Account ac = new Account();
	
	public String name = null;
	
	public Racing(String name) {
		this.name = name;
	}
	
	public  void run() {
		
		for (int i = 1; i <= 5; i++) {
			ac.deposit(name, 1000);
		}
		
	}
	
}
