package com.Abstraction;

public class Theam implements Dark, Light {

	@Override
	public void light() {
		System.out.println("This is light theam");
		
	}

	@Override
	public void dark() {
		System.out.println("This is dark theam");
		
	}

}
