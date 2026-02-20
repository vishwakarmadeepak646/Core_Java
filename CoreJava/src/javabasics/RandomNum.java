package javabasics;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		
		Random  r = new Random();
		
		for(int i = 1; i<6; i++) {
		int ran = r.nextInt(1000);
		
		System.out.println(ran);
		}
		
	}
}
