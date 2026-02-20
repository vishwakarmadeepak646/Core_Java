package javabasics;

public class TablePrinting {

	// Printing table from 2 to 10
	public static void main(String[] args) {
		int i,j;
		for( i = 2 ; i<11 ; i++) {
			System.out.print("Table of "+i+ " : ");
			for(j = 1; j < 11; j++) {
			
			 System.out.print(j*i + " ");
			}
			System.out.println();
		}
		
		
	}
}
