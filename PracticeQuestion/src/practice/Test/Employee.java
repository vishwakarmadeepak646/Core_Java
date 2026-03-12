package practice.Test;

import java.lang.Comparable;

public class Employee implements Comparable<Employee> {

	public String name;
	public int empid;
	public double salary;
	
	public Employee(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		
	}
	
	@Override
	public int compareTo(Employee e) {
		
		return empid - e.empid ;
	}
	
	public String toString() {
		return  " Emp Id : " + empid + "  Name : " + name + " Salary : " + salary;
	}

	

	
}
