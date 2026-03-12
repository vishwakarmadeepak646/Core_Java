package practice.Test;


import java.lang.Comparable;

public class MarkSheet implements Comparable<MarkSheet> {

	public String rollno;
	public String name;
	public int marks;

	public MarkSheet(String rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int compareTo(MarkSheet m) { // This is Comparable Interface method
		return rollno.compareTo(m.rollno);
	}

	public String toString() {
		return "Roll No : " + rollno + " Name : " + name + " Marks : " + marks;
	}
}
