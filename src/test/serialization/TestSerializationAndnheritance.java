package test.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A
{
	public A(int i) 
	{
		this.i =i;
	}
	
	A(){
		i=50;
	}

	int i;
	
	
}

class B extends A implements Serializable
{
	int j;
	
	B(int i, int j)
	{
		super(i);
		this.j =j;
	}
}
public class TestSerializationAndnheritance {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		B b = new B(10,20);
		System.out.println(b.i+","+b.j);
		
		System.out.println("serializing an object");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		
		oos.writeObject(b);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		B b1 = (B) ois.readObject();
		
		System.out.println("Deserializing an object");
		
		System.out.println(b1.i+","+b1.j);

	}

}
