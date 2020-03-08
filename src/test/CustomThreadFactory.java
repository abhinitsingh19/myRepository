package test;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory  implements ThreadFactory{

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		return new Thread(r,);
	}
	
	

}
