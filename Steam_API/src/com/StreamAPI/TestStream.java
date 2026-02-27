package com.StreamAPI;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class TestStream {

	public static void main(String[] args) {
	
		List<String> li = new ArrayList<String>();
		li.add("Deepak");
		li.add("Kapil");
		li.add("Ram");
		li.add("Shyam");
		li.add("Deepak");
		li.add("Ram");
		
		li.forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		li.stream().distinct().forEach(System.out::println);
		
		System.out.println("----------------------------------");

		li.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println); //.sorted() -- For sorting
		// Comparator.reverseOrder() ---> Reverse the String
		
		System.out.println("----------------------------------");

		li.stream().distinct().map(e -> e.toLowerCase()).forEach(System.out::println); // For map() --> We can use all String class methods which can not written boolean. like  toLowerCase()
		
		System.out.println("----------------------------------");

		li.stream().distinct().map(e -> e.toLowerCase()).forEach(System.out::println);
		
		System.out.println("----------------------------------");

		li.stream().filter(e -> e.startsWith("R")).distinct().forEach(System.out::println);// For filter() --> We can use all String class methods which written boolean. like  true or false only

	}

}
