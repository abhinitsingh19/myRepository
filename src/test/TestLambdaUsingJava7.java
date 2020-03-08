package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambdaUsingJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people =  new ArrayList<Person>();
		
		Person p1 =new Person("abhinit", "Singh", 29);
		
		Person p2 =new Person("aarush", "Sharma", 31);
		
		Person p3 =new Person("natalya", "khvalko", 21);
		
//		List<Person> people = Arrays.asList(new Person("abhinit", "Singh", 29), new Person("aarush", "Sharma", 31),
//				new Person("natalya", "khvalko", 21));
		
		people.add(p3);
		people.add(p2);
		people.add(p1);

		// sort the elements by firstName
		Collections.sort(people,new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub\
				Person p1 = (Person) o1;
				Person p2 = (Person) o2;
				return p1.getLastName().compareTo(p2.getLastName());
			}});
		
		System.out.println(people);
	}

}
