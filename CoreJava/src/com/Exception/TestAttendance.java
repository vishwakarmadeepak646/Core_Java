package com.Exception;

public class TestAttendance {

	public static void main(String[] args) {
		
		int a = 5;
		String str ="NotPresent";
		
		if(str == "Present") {
			System.out.println("Present");
		}else {
			try {
			throw  new AttendanceException();
			}catch(AttendanceException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
