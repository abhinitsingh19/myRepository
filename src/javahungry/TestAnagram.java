package javahungry;

import java.util.Scanner;

/**
 * @author Abhi
 *
 */
public class TestAnagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
		
		System.out.println("please Enter first string>>>"+firstString);
		System.out.println("plese Enter second string>>>"+secondString);
		
		System.out.println(checkAnagram(firstString,secondString));
	}

	/**
	 * @param firstString
	 * @param secondString
	 */
	private static boolean checkAnagram(String firstString, String secondString) 
	{
		char[] charArray1=firstString.toCharArray();
		boolean isAnagram = false;
		for (int i = 0; i < charArray1.length; i++) 
		{
			char  ch = charArray1[i];
			if(secondString.indexOf(ch)!=-1)
			{
				isAnagram= true;
				secondString = secondString.substring(0, secondString.indexOf(ch))+
						secondString.substring(secondString.indexOf(ch)+1);
			}
			else
			{
				isAnagram=false;
				break;
			}
				
		}
		return isAnagram;
				
	}

}
