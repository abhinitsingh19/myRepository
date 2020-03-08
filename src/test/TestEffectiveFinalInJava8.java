package test;

import java.util.HashMap;
import java.util.Map;

public class TestEffectiveFinalInJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		 boolean b = false ;
		 
		 boolean [] bArray = new boolean[1];
		
		 Map<String,String>  attributes  = new HashMap<>();
		 attributes.put("shiftlog1","status");
		 attributes.put("shiftlog2","warning");
		 
//		 attributes.forEach(()->{System.out.println();});
//	   Runnable r = new Runnable() {
//			public void run() {
//				int i=0;
//				while(i <10 && !b)
//				{
//					System.out.println(Thread.currentThread().getName()+">>"+i);
//					if(i==5)
//					{
//						b = true;
//					}
//				}
//			}
//		};
		
		// substituting anonymous inner class by lambda
		
//		
//		Runnable r1 = ()->{int i=0;
//		while(i <10 && !bArray[0])
//		{
//			System.out.println(Thread.currentThread().getName()+">>"+i++);
//			if(i==5)
//			{
//				bArray[0]= true;
//			}
//		}};
//		new Thread(r1).start();
		
	}

}
