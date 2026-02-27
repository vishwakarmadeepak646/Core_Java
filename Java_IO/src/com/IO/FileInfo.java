package com.IO;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\TestFile.txt");
		
		if(file.exists()) {
			
			System.out.println("File Name : " + file.getName());
			System.out.println("File path : " + file.getAbsolutePath());
			
			System.out.println("-----Access Permission-------");
			System.out.println("Writeable : " + file.canWrite());
			System.out.println("Readable :" + file.canRead());
			
			System.out.println("----------Check if it is a folder/directory or a file-----------");
			System.out.println("Is it a file : " + file.isFile());
			System.out.println("Is it a Directory : " + file.isDirectory());
			
			System.out.println("---------Last modified date of file, floder/directory");
			Date modify = new Date(file.lastModified());
			System.out.println("Last modify : " + modify);
			System.out.println("File Length : " + file.length()); // It will written no. of character inside the file including space
			
		}else {
			System.out.println("File Not Found");
		}

	}

}
