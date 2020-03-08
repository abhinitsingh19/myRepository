package test.methodoverloadingandriding;

class A1
{
		static void method(int i)
		{
			System.out.println("A");
		}
}

class B1 extends A1
{
		static void method(int i)
		{
			System.out.println("B");
		}
}
public class TestOverridingOfStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new B1();
		a.method(1);
	}

}
