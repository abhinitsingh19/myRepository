package test;

class SuperClass
{
    void superClassMethod(Number n)
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
    void superClassMethod(String d)
    {
        System.out.println("From Sub Class");
    }
}
 
public class Test 
{    
    public static void main(String[] args)
    {
        SubClass sub = new SubClass();
         
        sub.superClassMethod(null);
    }
}