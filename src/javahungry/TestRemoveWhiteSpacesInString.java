package javahungry;

public class TestRemoveWhiteSpacesInString 
{

	public static void main(String[] args) 
	{
		String str="SS DD DA";
		System.out.println("Input String"+" "+str);
		removeWhiteSpaces(str);	
	}

	private static void removeWhiteSpaces(String str)
	{
		char[] arr = str.toCharArray();
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]== ' ')
			{
				str= str.substring(0, str.indexOf(arr[i]))+str.substring(str.indexOf(arr[i])+1);
			}
		
		}
		System.out.println("Output String"+" "+str);		
	}

}
