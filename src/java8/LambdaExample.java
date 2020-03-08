package java8;

public class LambdaExample
{

	public static void main(String[] args) 
	{
		funcInterface f = (i ,j)->
		{
			int k  =  i+j;
			System.out.println("inside method>>"+k);
		};
		f.method2(3,4);
		
	}
}
