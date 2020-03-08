package java8;

public interface funcInterface 
{

	default void  method1()
	{
		System.out.println("default method of java 8");
	}
	
	abstract  void method2(int i, int j);
}		
