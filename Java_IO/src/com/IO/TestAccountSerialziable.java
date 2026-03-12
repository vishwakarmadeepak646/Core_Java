package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerialziable {

	public static void main(String[] args) throws Exception {
		
		Account a = new Account(123987, 78000);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\account.txt"));
		// Above passing the file, In which we have to serialized the object
		
		out.writeObject(a); // Here in that file writing the object in the file using the out.writeObject(a) method
		out.close();
		
		System.out.println("Account Class object is serialized successfully");
		
		// Now DeSerialized object from byte code to readable code
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\Rough work\\account.txt"));
		// Using above file take object, which is present in that file and DeSerialized it
		
		a = (Account) in.readObject(); // Read Object and type-caste it into account object
		
		System.out.println(a);
	}
}
