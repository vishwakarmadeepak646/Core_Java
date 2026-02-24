package com.Collection.Sorting;

public class Employee {

	public int id;
	public String name;
	public int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {  // This is Object class method and Object class is parent of all classes & it return String only
		return "id : " + id + "  Name : " + name + "  Salary : " + salary;
		
	}
	

}
