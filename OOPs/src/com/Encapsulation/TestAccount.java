package com.Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		a.setNumber("1234567");
		a.setAccountType("Saving");
		a.setBalance(50000);
		
		System.out.println("Bank Name is : " + a.BANK);
		System.out.println("Account number: " + a.getNumber());
		System.out.println("Balance : " + a.getBalance());
		System.out.println("Account Type : " + a.getAccountType());
		
		a.deposit(10000.50);
		
		a.withdrawal(5000.45);
		
		a.payBill(1000);
	}
}
