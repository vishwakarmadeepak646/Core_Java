package practice.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileInfoPrac {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\TestFile.txt");
		
		file.write("File writing testing");
		System.out.println(file);
	}
}