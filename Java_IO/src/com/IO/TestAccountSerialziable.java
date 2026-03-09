package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerialziable {

	public static void main(String[] args) throws Exception {
		
		Account a = new Account(123987, 78000);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\account.txt"));
		
		out.writeObject(a);
		out.close();
		
		System.out.println("Account Class object is serialized successfully");
		
		// Now DeSerialized object from byte code to readable code
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\account.txt"));
		
		a = (Account) in.readObject();
		
		System.out.println(a);
	}
}
