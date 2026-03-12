package practice.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberStream {

	public static Boolean isPrime(int i) {

		int count = 0;

		if (i == 0) {
			return false;
		}

		for (int j = 2; j < i; j++) {

			if (i % j == 0) {
				count++;
			}
		}

		if (count > 0) {
			return false;
		}
		return true;

	}

	public static void main(String args[]) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		for(int i = 1; i<25; i++) {
			li.add(i);
		}
		
		li.stream().filter(e -> isPrime(e)).skip(1).forEach(System.out::println);
	}
}
