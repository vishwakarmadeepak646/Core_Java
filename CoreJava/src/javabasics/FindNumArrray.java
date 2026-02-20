package javabasics;

public class FindNumArrray {

	public static void main(String[] args) {
		int arr[] = {2,3,5,6,8,9,12,9,3,19,9};
		
		int a = -1;
		int n  = 199;
		
		for (int i=0; i<arr.length; i++) {
			
			if(n == arr[i]) {
				System.out.println("Index of " + arr[i]+ " is : "+ i );
				
			}
					
		}
		if(a == -1) {
			System.out.println(n + " : This element is present in array");
		}
	}
}
