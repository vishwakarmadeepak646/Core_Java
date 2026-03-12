package practice.Test;

import java.util.Comparator;

public class OrderByRollNo implements Comparator<MarkSheet> {
	
	public int compare(MarkSheet o1, MarkSheet o2) {
		return o1.rollno.compareTo(o2.rollno); // DESC
	}

}
