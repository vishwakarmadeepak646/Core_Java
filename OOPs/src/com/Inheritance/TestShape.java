package com.Inheritance;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		System.out.println(r.borderWidth = 1);
		System.out.println(r.color = "Red");
		r.setLegth(5);
		r.setWidth(10);
		r.area();

		System.out.println("------------------------------------------");

		Triangle t = new Triangle();
		System.out.println(t.color = "Yellow");
		t.setBase(10);
		t.setHeight(5);
		t.area();

		System.out.println("------------------------------------------");

		Circle c = new Circle();
		c.setRadius(8);
		c.getRadius();
		c.area();

	}
}
