package javahungry;

public class TestIntersectionOfArray 
{

	public static void main(String[] args)
	{
		int[] arr1= {1,3,4,5};
		int[] arr2= {6,5,3,4};
		
		int[] res = new int[arr2.length];
		int temp=0;
		for(int i =0;i<arr1.length;i++)
		{
			for (int j = 0; j < arr2.length; j++) 
			{
			
				if(arr1[i]==arr2[j])
//					System.out.println(arr2[j]);
					res[temp++]=arr2[j];
			}
		}
		
		printResultArray(res);
	}
	
	public static void printResultArray(int[] res)
	{
		
		for (int i = 0; i < res.length; i++) 
		{
			System.out.println(res[i]);
			
		}
	}

	
	
}
