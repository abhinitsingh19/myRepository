
public class A {

	private
	static A a;

	private A() {
	};

	static A getInstance() {
		if (a == null) {
			synchronized (A.class) {

				if (a == null) {
					a = new A();
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {

		A.getInstance();

	}
}
