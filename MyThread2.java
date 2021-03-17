class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Running Thread1 : "+i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println("Running Thread2 : "+i);
		}
	}
}
class TestThread
{
	public static void main(String args[])
	{
		MyThread1 t1=new MyThread1();
		t1.run();
		MyThread2 t2=new MyThread2();
		t2.run();