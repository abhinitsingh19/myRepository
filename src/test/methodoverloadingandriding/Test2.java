package test.methodoverloadingandriding;

import java.sql.SQLException;

class Test2
{
    void myMethod() throws SQLException
    {
        System.out.println("Super Class");
    }
}
 
class Sub extends Test2
{
    @Override
    void myMethod() throws Exception
    {
        System.out.println("Sub Class");
    }
}