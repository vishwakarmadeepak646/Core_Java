package com.Encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;
	public double amt = 0;
	public static final String BANK = "Central Bank Of India";  // Here we used final Keyword. It assigned only once in life
	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void deposit(double amt) {
		this.amt = amt;

		this.balance = this.balance + amt;
		System.out.println("You have deposit" + amt + " Now your balance is : " + balance);
	}

	public void withdrawal(double amt) {

		if (amt < this.balance) {
			this.balance = this.balance - amt;

			System.out.println("You withdrwal amount is : " + amt + " Now your balance is : " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}

	}

	public void payBill(double amt) {

		this.balance = this.balance - amt;

		System.out.println("You pay Bill amount is : " + amt + " Now your balance is : " + balance);
	}

}
