package javahungry;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestCountWordsInString 
{

	public static void main(String[] args) 
	{
		System.out.println("Please Enter input String");
		Scanner scanner =  new Scanner(System.in);
		String inputString = scanner.nextLine();
		System.out.println("Input String is:::"+inputString);
		
		findCountOfWordsInString(inputString);
		
		
	}

	private static void findCountOfWordsInString(String inputString) 
	{
		int count=0;
		StringTokenizer token = new StringTokenizer(inputString, " ");
		System.out.println(token.countTokens());
	char[] charArray = inputString.toCharArray();
		for (int i = 0; i < charArray.length; i++) 
		{
			if (charArray[i] ==' ')
			{
				count++;
			}
		}
		
		System.out.println(count+1);
		
	}

}
