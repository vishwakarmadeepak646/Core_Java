package practice.Test;
import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String args[]) {
		
		List list = new ArrayList();
		
		list.add(59);
		list.add("Deepak Vishwakarma");
		list.add(true);
		list.add("Ram");
		list.add(78.9);
		
		List list1 = new ArrayList();
		
		list1.add("Ram");
		list1.add(45.8);
		list1.add(65);
		list1.add("Deepak");
		list1.add(45);
		list.add(0, "Sita");
		
		System.out.println(list.get(4));
		System.out.println(list.remove(3));
		System.out.println(list);
		
		System.out.println(list.set(1, "Deepak"));
		System.out.println(list);
		
		System.out.println(list1.indexOf("Deepak"));
		System.out.println(list1.lastIndexOf("Deepak"));
		
		System.out.println(list1.subList(0, 3));
		
		System.out.println(list.addAll(3, list1));
		System.out.println(list);
	}
}
