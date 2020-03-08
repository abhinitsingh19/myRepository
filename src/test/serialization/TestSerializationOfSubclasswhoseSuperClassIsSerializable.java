package test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person1 implements Serializable {

	int id;
	String name;

//	private transient Employee address;

	Person1(int id, String name) {

		this.id = id;
		this.name = name;
//		this.address = address;
	}
}

class Employee extends Person1{
	Employee(int id, String name,String city) {
		super(id, name);
		this.city= city;
		
		// TODO Auto-generated constructor stub
	}

	private void readObject(ObjectInputStream ois) throws NotSerializableException
	{
//		return city;
		
		throw  new NotSerializableException();
		
	}
	private void writeObject(ObjectOutputStream ois) throws NotSerializableException
	{
//		return city;
		
		throw  new NotSerializableException();
		
	}
	private String city;


}
public class TestSerializationOfSubclasswhoseSuperClassIsSerializable 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee add = new Employee(155925,"Abhinit","Gurgaon");
//		Person p = new Person(155915, "Abhinit", add);

		System.out.println("Serializing an object");
		FileOutputStream fos = new FileOutputStream("a.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(add);

		System.out.println("Deserializing an Object");

		FileInputStream fis = new FileInputStream("a.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee p1 = (Employee) ois.readObject();
}
}