package com.Exception;

public class TestLoginException {

	public static void main(String[] args) {
		
		String login ="admin2";
		
		if(login == "admin") {
			System.out.println("User Found");
		}else {
			try {
			throw new LoginException();
			}catch(LoginException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
