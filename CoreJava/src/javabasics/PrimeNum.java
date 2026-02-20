package javabasics;

public class PrimeNum {
	public static void main(String[] args) {
		
		int n = 9;
		int count = 0;
		
		for(int i =1 ; i<=n ; i++) {
			
			if(n%i==0) {
				count++;
			}
		}
		if(count==2)
			System.out.println("This is a Prime Number : " + n);
		else
			System.out.println("This is not a Prime Number : " + n);
	}
}
