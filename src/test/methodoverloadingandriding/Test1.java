package test.methodoverloadingandriding;

import java.util.ArrayList;
import java.util.List;

class A
{
     List<Integer> methodOne() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("AAA");
		return null;
    }
}
 
class B extends A
{
     ArrayList<Integer> methodOne()
    {
        System.out.println("BBB");
		return null;
    }
}
 
public class Test1
{
    public static void main(String[] args)
    {
        A a = new B();
         
			a.methodOne();
	
    }
}