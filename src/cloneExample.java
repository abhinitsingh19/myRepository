
public class cloneExample {
	public static void main(String[] args) {
		Person p = new Person(101, "Abhinit");
		Person p1 = (Person) p.clone();

		System.out.println(p1.getID() + ">>>" + p1.getName());

	}
}

class Person implements Cloneable {

	private int id;

	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;

	}

	@Override
	protected Object clone() {
		Object obj = null;

		try {
			obj = super.clone();

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;

	}

}