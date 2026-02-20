package com.Inheritance;

public class Circle extends Rectangle {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void area() {
		System.out.println("Area of Circle is : " + Math.PI*radius*radius);
	}
}
