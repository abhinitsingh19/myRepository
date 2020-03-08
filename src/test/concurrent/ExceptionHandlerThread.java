package test.concurrent;

import java.lang.Thread.UncaughtExceptionHandler;

class MyExceptionHandler implements UncaughtExceptionHandler
{

	@Override
	public void uncaughtException(java.lang.Thread t, Throwable e) 
	{
		System.out.println("exception returned by thread is"+ e.getStackTrace());		

	}
	
}

class MyThread implements Runnable
{

	@Override
	public void run() 
	{

		int i = Integer.parseInt("ABC");
	}
	

}



public class ExceptionHandlerThread 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread(new MyThread());
		t.start();
		
		t.setUncaughtExceptionHandler(new MyExceptionHandler());
	}
}
