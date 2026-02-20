package com.Constructor;

public class ConstSchool extends ConstructorPractice {

	private String StdName;
	private int rollNo;
	private int cls;

	public ConstSchool(String stdName) {
		super(); // Calling parent class default const using super keyword.
		this.StdName = stdName;

		System.out.println("Student Name : " + stdName);
	}

	public ConstSchool(int rollNo, int cls) {
		this("Deepak"); // calling above constructor inside another constructor using this keyword.
		// Constructor calling always should first stmt inside another constructor
		this.rollNo = rollNo;
		this.cls = cls;

		System.out.println("Roll Number : " + this.rollNo);
		System.out.println("Class : " + cls);
	}

	// We call more than one Constructor that is Constructor Overloading
	//

}
