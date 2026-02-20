package com.string;
import java.util.Date;

public class DatePrint {
	public static void main(String[] args) throws InterruptedException {
		//Date d = new Date();
	//	System.out.println(d);
		
		System.out.println(" ------------------------");
		while(true) {
			Date d = new Date();  // Here new object is created every time, So it's current time.
			System.out.println(d);
			Thread.sleep(2000);
		}
	}

	
}
