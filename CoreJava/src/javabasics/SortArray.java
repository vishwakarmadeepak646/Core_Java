package javabasics;

public class SortArray {

	public static void main(String[] args) {

		// Sorting the Array in Ascending order
		int[] arr = { 4, 2, 6, 1, 8, 10, 23, 0, 8 };
		int temp = 0;

		for(int i=0; i< arr.length; i++) {
			for(int j=i+1;  j< arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println(arr[i]);
		}

	}
}
