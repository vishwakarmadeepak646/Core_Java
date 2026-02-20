package com.Inheritance;

public class Rectangle extends Shape{

	private int length;
	private int width;
	public int getLegth() {
		return length;
	}
	public void setLegth(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area() {
		System.out.println("Area of Rectangle is : " + (length*width));
	}
}
