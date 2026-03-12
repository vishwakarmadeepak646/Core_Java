package com.Collection.Sorting;

public class Marksheet implements Comparable<Marksheet> { 

	public String rollno;
	public String name;
	public int marks;
	
	public Marksheet(String rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Marksheet o) {
		//return rollno.compareTo(o.rollno);  // It will sort in Ascending order if obj1 (rollno) written first
		return o.rollno.compareTo(rollno); // This will sort in DESC or as we have change the object from first to second
		
	//	return rollno - o.rollno; // If rollno is a int then we use - symbol
	}
	
	public String toString() {
		return "Roll No : " + rollno + " Name : " + name + " Marks : " + marks;
	}

	
	
}
