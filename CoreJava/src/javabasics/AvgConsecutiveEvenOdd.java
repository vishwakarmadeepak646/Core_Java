package javabasics;

public class AvgConsecutiveEvenOdd {

	public static void main(String[] args) {
		int n = 14;
		float sumEven = 0f;
		float sumOdd = 0f;
		int count1 = 0;
		int count2 = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
				count1++;
			} else {
				sumOdd = sumOdd + i;
				count2++;
			}
		}
		System.out.println("Avg of Even Number : " + (sumEven / count1++));

		System.out.println("Avg of Odd Number : " + sumOdd / (count2++));
	}
}
