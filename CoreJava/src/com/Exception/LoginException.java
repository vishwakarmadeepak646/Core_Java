package com.Exception;

public class LoginException extends RuntimeException { // Custom Exception Class
	

	public LoginException() {
		super("user not found");
	}

}
