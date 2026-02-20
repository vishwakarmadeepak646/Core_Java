package javabasics;

public class TestString {
	public static void main(String[] args) {
		
		char arr[] = {'a','f','s','w','e','p','m'};
		
		System.out.println(arr[3]); //
		
		System.out.println("This is printed by using the For loop : ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("This is printed by using the For Each loop : ");
		for(char a : arr) {
			System.out.print(a + " ");
		}
	}
}
