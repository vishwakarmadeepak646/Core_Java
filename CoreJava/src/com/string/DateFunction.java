package com.string;

import java.time.LocalDate;

public class DateFunction {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();

		System.out.println("Today's day: " + now); // Written date
		System.out.println("day of week : " + now.getDayOfWeek());
		System.out.println("Day of Month : " + now.getDayOfMonth()); // Todays Date of this month
		System.out.println("Month : " + now.getMonth());
		System.out.println(" Which number of Day of this Year : " + now.getDayOfYear());
		System.out.println("Year : "+ now.getYear());
		
		System.out.println("==========================");
		
		LocalDate dob = LocalDate.of(1999, 02, 20);
		System.out.println(dob);
	}
}
