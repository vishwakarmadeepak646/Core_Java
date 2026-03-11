package com.thread.Racing;

public class Account {

	private int balance;
	
	public int getBalance() {
		try {
		Thread.sleep(100);
		}catch(InterruptedException e) {
			e.getMessage();
		}
		return balance;
	}
	
	public void setBalance(int balance) {
		try {
		Thread.sleep(100);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.balance =  balance;
	}
	
	public  void deposit(String name, int amt) { // This method is not synchronized so that it will show only 5000 as deposit but in real world it should be 1000
		int total = getBalance() + amt;
		
		setBalance(total);
		System.out.println(name + " : " + getBalance());
		 
	}
}
