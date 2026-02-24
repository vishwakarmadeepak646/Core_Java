package javabasics;

public class SecondLargeNum {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 909, 5, 3, 9, 88, 4, 6, 98 };

		int sec = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max) {
				
				sec = max;
				max = arr[i];
				
			}
			
			if(max>arr[i] && sec<arr[i]) {
				
				sec = arr[i];
			}
		}
		
		System.out.println("Second Largest Element in Array : " + sec);
		System.out.println("Largest Element in Array : " + max);	
	}
}
