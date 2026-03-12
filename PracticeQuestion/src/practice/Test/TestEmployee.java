package practice.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Deepak", 122, 80000);
		Employee e2 = new Employee("Ram", 124, 70000);
		Employee e3 = new Employee("Syam", 102, 86000);
		Employee e4 = new Employee("Rikatan", 112, 50000);
		Employee e5 = new Employee("Ritik", 192, 30000);
		
		List<Employee> li = new ArrayList<Employee>();
		
		li.add(e1);
		li.add(e5);
		li.add(e4);
		li.add(e2);
		li.add(e3);
		
		System.out.println(li);
		
		System.out.println("-------------------------");
		
		Collections.sort(li);
		
		li.forEach(System.out::println);
	}
}
