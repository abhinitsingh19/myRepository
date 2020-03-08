package test.mutithreading;

public class TestDeadLock 
{
	private  static String str1 = new String();
	private  static String str2 =new String();

	public static void main(String[] args) 
	{

		new Thread(new Runnable()
		{
			public void run()
			{
				synchronized (str1) 
				{
					System.out.println(Thread.currentThread().getName()+"have acquired a lock o str1 obj");
					try
					{
						Thread.sleep(2000);
					}
					catch(InterruptedException ie)
					{
						ie.printStackTrace();
					}
					synchronized (str2) 
					{
						System.out.println("trying to  acquired a lock on str2 obj");

					}
				}

			}
		}).start();

		new Thread(new Runnable()
		{
			public void run() 
			{
				synchronized (str2) 
				{
					System.out.println(Thread.currentThread().getName()+"have acquired a lock on str2 obj");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (str1) 
					{
						System.out.println("trying to acquire a lock on str1 obj");

					}
				}
			}
		}).start();
	}

}
