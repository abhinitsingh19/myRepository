package javahungry;

import java.util.Scanner;

public class TestFirstNonRepeatedCharacterInString 
{

	public static void main(String args[])
	{
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the I/P String");
		String str =scan.nextLine();
		System.out.println("Input String is>>>"+str);

		printfirstNonRepeatedCharacter(str);
	}

	public static void printfirstNonRepeatedCharacter(String str)
	{
		String temp="";
//		boolean isRepeated=false;
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			int indexOf = temp.indexOf(charArray[i]);
			if(indexOf==-1)
			{
				temp+=charArray[i];
			}
			else
			{
				temp= temp.substring(0, indexOf)+temp.substring(indexOf+1);
//				isRepeated = true;
			}
				
					
		}
		
		System.out.println("first non repeated character in I/P String>>>"+str+"is----"+temp.charAt(0));
	}

}
