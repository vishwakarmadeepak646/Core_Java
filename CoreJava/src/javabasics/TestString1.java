package javabasics;

public class TestString1 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,122,3,9,8,0,7,89};
		int i = 1;
		int max = arr[i];
		
		for( i = 1; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println("Max number in this Array is : " + max);
	}
}
