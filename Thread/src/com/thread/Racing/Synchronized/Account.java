package com.thread.Racing.Synchronized;

public class Account {

	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		return balance;
	}

	public void setBalance(int balance) {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		this.balance = balance;
	}

	public synchronized void deposit(String name, int amt) { // synchronized keyword allow only one use at a time and another is waiting once 1st finish then 2nd user will deposit.

		int total = getBalance() + amt;

		setBalance(total);

		System.out.println(name + " : " + getBalance());
		
		// Or else if we don't want to make synchronized method then use synchronized block
//		synchronized(this) {
//			int total = getBalanc() + amt;
//			setBalance(amt);
//		}
 		}
		
	
}
