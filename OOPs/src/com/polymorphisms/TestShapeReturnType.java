package com.polymorphisms;

public class TestShapeReturnType {

	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		
		s[0] = Shape.getShape(0);
		s[1] = Shape.getShape(1);
		s[2] = Shape.getShape(2);
		
		Circle c = (Circle)s[0];
		c.setColor("Red"); // Need to print then only it is visible
		c.setBorderWidth(5);
		c.setRadius(5);
		
		Rectangle r = (Rectangle)s[1]; // Creating child object using parent reference that why doing the type casting
		r.setWidth(5);
		r.setLength(5);
		
		Triangle t = (Triangle)s[2];
		t.setHeight(10);
		t.setBase(10);
		
		for(int i= 0 ; i<s.length;i++) {
		
		s[i].area();
		}
	}
}

