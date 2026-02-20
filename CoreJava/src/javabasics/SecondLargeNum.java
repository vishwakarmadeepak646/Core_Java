package javabasics;

public class SecondLargeNum {
	public static void main(String[] args) {
		int a[] = { 1, 3, 90, 5, 3, 9, 88, 4, 6, 98 };

		int max = a[1];
		int i = 0;
		int sec = 0;

		for (i = 0; i < a.length; i++) {

			if (a[i] > max) {
				sec = max;
				max = a[i];

			}
		}
		System.out.println("Largest Number of this Array is : "+ max);
		System.out.println("Second Largest Number of this Array is : "+ sec);

	}
}
