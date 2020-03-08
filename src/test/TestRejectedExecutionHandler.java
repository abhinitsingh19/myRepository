package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class TestRejectedExecutionHandler  implements RejectedExecutionHandler{

	public static void main(String[] args) {
		
	
	ExecutorService executor = Executors.newFixedThreadPool(3);
	
	executor.execute
	}

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		// TODO Auto-generated method stub
		
	}
}


