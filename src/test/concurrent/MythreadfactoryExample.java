package test.concurrent;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;

class Mythreadfactory implements ThreadFactory
{

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread t = new Thread(r);
		t.setName("MyThread");
		t.setPriority(Thread.MAX_PRIORITY);
		t.setDaemon(false);
//		t.setDefaultUncaughtExceptionHandler(eh);
		
		return t;
	}

}
 
 public class MythreadfactoryExample{
	 
	 
	 public static void main(String[] args) {
		 
		 Runnable  r = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("do somethimg");
			}
		};
		
		Mythreadfactory mtf = new Mythreadfactory();
		Thread t = mtf.newThread(r);
		t.setUncaughtExceptionHandler(new MyExceptionHandler());
//		t.start();
	}
 }
