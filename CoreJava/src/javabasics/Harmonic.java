package javabasics;

public class Harmonic {
	public static void main(String[] args) {

		int n = 8;
		float sum = 0;

		System.out.println("Harmonic Series is : ");
		for (int i = 1; i <= n; i++) {

			sum = 1f / i;
			System.out.print(sum + ", ");
		}

	}
}
