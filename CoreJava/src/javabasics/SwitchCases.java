package javabasics;

public class SwitchCases {
public static void main(String[] args) {
	
	String day = "Friday";
	
	switch(day) {
	case "Monday":
		System.out.println("Today is Monday");
		break;
	case "Tuesday":
		System.out.println("Today is Tuesday");
		break;
	case "Wednusday":
		System.out.println("Today is Wednusday");
		break;
	case "Thusday":
		System.out.println("Today is Thursday");
		break;
	case "Friday":
		System.out.println("Today is Friday");
		break;
	case "Saturday":
		System.out.println("Today is Saturday");
	default:
		System.out.println("Today is Sunday Funday");
		
	}
}
}
