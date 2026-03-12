package com.IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader {

	public static void main(String args[]) throws Exception {

		FileReader file = new FileReader("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\TestFile.txt");

		BufferedReader r = new BufferedReader(file);

		String line = r.readLine(); // It will read only single line
		
	//	System.out.println(line);
		
		while(line != null) {
			
			System.out.println(line);
			line = r.readLine(); // This line will read next line 
			
		}
		
		r.close();
	}
}
