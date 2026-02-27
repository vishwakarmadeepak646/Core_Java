package com.IO;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\TestFile.txt");
		
		int i = file.read(); // It will read single char as a int
		
		while(i != -1) {
			
			System.out.println((char) i + " = " + i);
			i =  file.read();  // Using loop it will read again
		}
		
		file.close();

	}

}
