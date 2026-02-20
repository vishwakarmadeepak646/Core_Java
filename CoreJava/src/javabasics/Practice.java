package javabasics;

public class Practice {

	public static void main(String[] args) {
		int [] a = {1,4,2,5,6,9,67,98,56};
		int temp=0;
		int count=0;
		
		for(int i =0 ; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
			
			}
		if(count==0) {
			System.out.println("Array is not sorted. Sorted array is" );
			}else {
				
				System.out.print("Arrya is sorted");
		}
		
	}
}
