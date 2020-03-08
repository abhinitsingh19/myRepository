package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachInJava8 
{

	public static void main(String[] args) 
	{
		List<Integer> lst = new ArrayList<>(Arrays.asList(1,7,4,8,9));
		
		lst.forEach((i)->{if(i%2==0){System.out.println(i);}});
	}
}
