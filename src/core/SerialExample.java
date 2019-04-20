package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Emp implements java.io.Serializable {
	private static final long serialversionUID = 129348938L;

	transient int a;
	static int b;
	int age;
	String name;

	public Emp(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}
}

public class SerialExample {
	public static void printData(Emp object1) {
		System.out.println("Name: " + object1.name);
		System.out.println("Age: " + object1.age);
		System.out.println("a: " + object1.a);
		System.out.println("b: " + object1.b);
	}

	public static void main(String[] args) {
		
		Emp object =new Emp("Ashish", 26, 2,1000);
		String filename="Ashish.txt";
		
		try
		{
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			out.writeObject(object);
			out.close();
			file.close();
			
			System.out.println("Data has been serialized \n Data before Deserialized");
			printData(object);
			
			object.b=2000;
		}

		catch(IOException ex)
		{
			System.out.println("IOException caught");
		}
		
		object=null;
		
		try
		{
		   FileInputStream file=new FileInputStream(filename);
		   ObjectInputStream in=new ObjectInputStream(file);
		   
		   object=(Emp)in.readObject();
		   in.close();
		   file.close();
		   
		   System.out.println("Object has been deserialized\n"
                   + "Data after Deserialization.");
		   
		   printData(object);
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException caught");
		}
		
	}

}
