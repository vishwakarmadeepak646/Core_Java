package com.java__Features;

public interface DefaultAndStatic {

// A default method is a method inside an interface that has a method body (implementation).
//	Defined using default keyword
//	Must be inside interface
//	Can have method body
//	Implementing class can override it

	public default void anima() {
		System.out.println("Animal produces sound");
	}

//These methods belong to the interface itself, not to objects.
//	Defined using static keyword
//	Called using InterfaceName.methodName()
//	Cannot be overridden by implementing classes
	
	public static void human() {
		System.out.println("Human Speakes");
	}
}
