/*package test.mutithreading;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

class Producer1 implements Runnable
{
	private LinkedList sharedQueue ;

	private int MAX_SIZE;

	Producer1( LinkedList queue, int i)
	{
		sharedQueue = queue;
		MAX_SIZE =i;
	}

	@Override
	public void run() 

	{
		while(true){
		synchronized (sharedQueue) {


			if (sharedQueue.size() == MAX_SIZE)
				try {
					sharedQueue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else
			{
				for (int i = 0; i < 5; i++) 
				{
					System.out.println(Thread.currentThread().getName()+ "is Producing  >>" +i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sharedQueue.add(i);
				}
			}

		}

	}
	}
}

class Consumer1 implements Runnable
{
	private BlockingQueue sharedQueue;

	Consumer1( BlockingQueue<Integer> queue)
	{
		sharedQueue = queue;
	}

	@Override
	public void run() 
	{
		while(true)
		{
		synchronized (sharedQueue) 
		{

			if(sharedQueue.size()==0)
			{
				try {
					sharedQueue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			else
			{
				System.out.println(Thread.currentThread().getName()+ "is consuming  >>" +sharedQueue.remove()); 
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				sharedQueue.notify();
			}
		}
	}}

}




public class PSUsingWaitAndNotify {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<>();
		Producer producer = new Producer(lst, 5);

		Consumer consumer = new Consumer(lst);

		new Thread(producer).start();

		new Thread(consumer).start();

	}

}
*/