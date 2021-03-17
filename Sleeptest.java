class thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
			    if(i==2) sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Thread 1:"+i);
		}
	System.out.println("Exit from thread t1:");
	}	
}
class thread2 extends Thread
{
	public void run()
	{
	    for(int j=0;j<=5;j++)
		{
			try
			{
			     if(j==3) sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}     
			System.out.println("Thread 2:"+j);
		}
	System.out.println("Exit from thread t2:");
	}
}
class thread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
			    if(i==2) sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Thread 3:"+i);
		}
	System.out.println("Exit from thread t3:");
	}	
}
class Sleeptest
{
	public static void main(String args[])
	{
		System.out.println("Harshpreet Singh Sandhu");
		System.out.println("65");
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		thread2 t3 = new thread3();
		t1.start();
		t2.start();
		t3.start();
	}
}	