package javabasics;

public class Marksheet {

	public static void main(String args[]) {
		
		int a = 31;

		if (a >= 80) {
			System.out.println("Student having A Grade");
		} else if (a >= 60) {
			System.out.print("B Grade");
		} else if (a >= 40) {
			System.out.print("C Grade");
		} else {
			System.out.print("Fail");
		}

	}
}
