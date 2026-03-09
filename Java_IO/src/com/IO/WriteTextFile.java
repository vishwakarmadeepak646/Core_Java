
package com.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\TestFile.txt");
		
		file.write("Hello Deepak");
		
		System.out.println("Text data write successfully" );
		
		
		file.close();
	}

}
