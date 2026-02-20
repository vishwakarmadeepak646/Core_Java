package javabasics;

public class SumAndDisibility {
	
	public static void main(String[] args) {
		
		int n =100;
		int sum = 0;
		
		for(int i =n ; i<=200; i++) {
			
			if( i%7==0) {
				sum = sum +i;
				
			}
			
		}
		System.out.println("Sum of Interger greater than 100 and less than 200 that are divisible by 7 " + sum);
		
	}
}
