package com.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class TestBufferedWriter {

	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\\\Users\\\\Asus\\\\OneDrive\\\\Desktop\\\\Rough work\\Hello.txt");
		
		BufferedWriter r = new BufferedWriter(file);
		
		r.write("public class Hello{");
		r.newLine();
		r.write("public static void main(String args[]){");
		r.newLine();
		r.write("System.out.println(\"Hello_World\"); ");
		r.newLine();
		r.write("}" + "\n" + "}");
		System.out.println("File Write successfully");
		r.close();
		
	}
}
