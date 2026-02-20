package javabasics;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, ...
		int n = 15;
		int k = 0;
		int j = 1;

		System.out.println("Fibonacci Series is: ");
		for (int i = 1; i <= n; i++) {

			System.out.print(k + ", ");
			k = k + j;
			j = k - j;

		}
	}
}
