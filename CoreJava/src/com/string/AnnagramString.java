package com.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnnagramString {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		// Here we arrange both string alphabetically order and check both are equal or
		// not
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

	//	if (arr1 == arr2)
	//	if(arr1.equals(arr2))
		
		if(Arrays.equals(arr1, arr2)){

			System.out.println(str1 + " & " + str2 + " are Annagram String");
		} else {
			System.out.println(str1 + " & " + str2 + " are not Annagram String");
		}

	}
}
