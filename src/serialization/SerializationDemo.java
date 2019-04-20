package serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable {
	public int a;
	public String b;

	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

public class SerializationDemo {

	public static void main(String[] args) {

		Demo object = new Demo(1, "Ashish");
		String filenmae = "file.ser";
		
		// Serialization
		try {
			// Saving of an object in a file
			FileOutputStream file = new FileOutputStream(filenmae);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method of serialization of object
			out.writeObject(object);
			out.close();
			file.close();

			System.out.println("Object has been serialized");
			System.out.println(object.a);
			System.out.println(object.b);
		}

		catch (IOException e) {

			System.out.println("IOException is caught");
		}

		Demo object1 = null;

		// Deserialization
		try {
			// Reading the file from a object

			FileInputStream file = new FileInputStream(filenmae);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deseriazation of object
			object1 = (Demo) in.readObject();
			in.close();
			file.close();

			System.out.println("Object has been deserialized");
			System.out.println("a :" + object1.a);
			System.out.println("b :" + object1.b);

		} catch (IOException e) {
			System.out.println("IOException caught");
		}

		catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException caught");
		}
	}

}
