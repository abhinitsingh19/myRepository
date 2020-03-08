package test.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	int id;
	String name;

	private transient Address address;

	Person(int id, String name, Address address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}
}

class Address {
	private String city;

	Address(String name) {
		city = name;
	}
}

public class TestSerializationIfClasshasaNotSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Address add = new Address("Gurgaon");
		Person p = new Person(155915, "Abhinit", add);

		System.out.println("Serializing an object");
		FileOutputStream fos = new FileOutputStream("a.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(p);

		System.out.println("Deserializing an Object");

		FileInputStream fis = new FileInputStream("a.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p1 = (Person) ois.readObject();

		System.out.println(p1.id + "," + p1.name);

	}
}
