package com.IO;

import java.io.Serializable;

public class Account implements Serializable{  // To convert object to Serialized we need to implements " Serializable " interface (This is marker interface)
	
	private transient int pinCode;
	private int balance; // transient keyword make pin-code to non accessible to attributes  or all.
	
	public Account(int pinCode, int balance) {
		this.pinCode = pinCode;
		this.balance = balance;
	}
	
	public String toString() {
		return "PinCode : " + pinCode + "Balance : " + balance;
	}

}
