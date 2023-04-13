package Thread;

class ThreadEx extends Thread
{
	//to execute the code
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread"+Thread.currentThread().getId()+":"+i);
			try
			{
				Thread.sleep(1000); // sleep for 1 second
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
} 
class ThreadExample
{
	public static void main(String[] args)
	{
		//create and start 3 threads
		ThreadEx t1=new ThreadEx();
		ThreadEx t2=new ThreadEx();
		ThreadEx t3=new ThreadEx();
		t1.start(); // to start the thread execution
		t2.start();
		t3.start();
		
		//wait for all threads to finish
		try
		{
		   t1.join();
		   t2.join();
		   t3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("All threads Finished.");

	}

}