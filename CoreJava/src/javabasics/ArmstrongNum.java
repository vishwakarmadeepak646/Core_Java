package javabasics;

public class ArmstrongNum {
	
	public static void main(String[] args) {

		int n = 153;
		int r = 0;
		int sum = 0;
		int num = 1;
		int match = n;
		
		while(n>0) {
			
			r = n % 10;
			num = r*r*r;
			sum = sum + num;
			n = n/10;
					
		}
		
		if (match == sum ) {
			System.out.println("This is a Armstrong Number : " + sum);
		}else {
			System.out.println("This is not a Armstrong Number : " + sum);
		}
	}
}
