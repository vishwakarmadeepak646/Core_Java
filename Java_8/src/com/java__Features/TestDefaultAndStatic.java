package com.java__Features;

public class TestDefaultAndStatic {

	public static void main(String[] args) {
		
		DefaultAndStatic d = new DefaultAndStatic() {
						
		};
		d.anima();
		
		System.out.println("----------Directly call using Interface name----------------------");
		
		DefaultAndStatic.human();
	}
}
