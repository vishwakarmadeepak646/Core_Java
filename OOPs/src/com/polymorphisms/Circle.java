package com.polymorphisms;

public class Circle extends Shape {

	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void area() {
		System.out.println("Area of Circle is : " + Math.PI*radius*radius);
	}
}
