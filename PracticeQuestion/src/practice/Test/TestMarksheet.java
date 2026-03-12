package practice.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {

	public static void main(String[] args) {

		MarkSheet m1 = new MarkSheet("101", "Deepak", 98);
		MarkSheet m2 = new MarkSheet("112", "Radhe", 90);
		MarkSheet m3 = new MarkSheet("109", "Kapil", 96);
		MarkSheet m4 = new MarkSheet("104", "Shyam", 91);

		List<MarkSheet> li = new ArrayList<MarkSheet>();

		li.add(m4);
		li.add(m3);
		li.add(m2);
		li.add(m1);

		System.out.println("--------Normal List Printing----------");
		li.forEach(System.out::println);

		System.out.println(" --------Comparable List Print sort by roll No-------------------");

		Collections.sort(li);

		li.forEach(System.out::println);

		System.out.println("-----------Comparator List print by Roll No-------------------");

		OrderByRollNo r = new OrderByRollNo();
		Collections.sort(li, r);

		li.forEach(System.out::println);

		System.out.println("--------------Comparator List print by Name----------");

		OrderByName b = new OrderByName();
		Collections.sort(li, b);

		li.forEach(System.out::println);

		System.out.println("--------------Comparator List print by Marks----------");

		OrderByMarks b2 = new OrderByMarks();
		Collections.sort(li, b2);

		li.forEach(System.out::println);
	}

}
