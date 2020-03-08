package test.mutithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SquareCalculator implements Callable<Integer>
{
	private int i;
	SquareCalculator(int i)
	{
		this.i =i;
	}


	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return i*i;
	}
}

class SumCalculator implements Callable<Integer>
{
	private int i;
	SumCalculator(int i)
	{
		this.i =i;
	}


	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return i+i;
	}
}



public class TestExecutorsCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Integer> result =ex.submit(new SquareCalculator(10));

		Future<Integer> result1 =ex.submit(new SumCalculator(10));

		System.out.println(result.get());

		System.out.println(result1.get());


		ex.shutdown();




	}

}
