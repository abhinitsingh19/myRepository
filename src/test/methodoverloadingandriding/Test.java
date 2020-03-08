package test.methodoverloadingandriding;

public class Test 
{    
    static void method(Double i)
    {
        System.out.println(1);
    }
     
     double method(Double d)
    {
        System.out.println(2);
		return d;
    }
     
   /* static void method(Number n)
    {
        System.out.println(4);
    }*/
     
    static void method(Object o)
    {
        System.out.println(5);
    }
     
    public static void main(String[] args)
    {
        method(1f);
    }
}