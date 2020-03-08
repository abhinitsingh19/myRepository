package test.mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class Worker implements Runnable
{
	private String command;
	Worker(String s)
	{
		command =s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"is xecuting "+command);
	}}

public class testExecutors 

{
	public static void main(String[] args) throws InterruptedException 
	{
		ExecutorService  executor = Executors.newFixedThreadPool(3);
		
		for(int i =0; i<5;i++)
		{
			Worker worker = new Worker(i+"");
			executor.execute(worker);
		}
		
		executor.shutdown();
		
		while( !executor.isTerminated())
		{
			System.out.println("waiting till all tasks are finished");
			executor.awaitTermination(2, TimeUnit.SECONDS);
		}
		
		System.out.println("all Tasks are executed");
		System.out.println("shutting down");
//		executor.shutdown();
		
		
	}

}
