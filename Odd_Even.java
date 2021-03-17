class Odd_Even 
{
    public static void main(String[] args) 
	{
        System.out.println("Harshpreet Singh Sandhu");
		System.out.println("65");
		Runnable r1 = new Runnable_odd();
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = new Runnable_even();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable_odd implements Runnable
{
    public void run()
	{
        for(int i=0;i<6;i++)
		{
            if(i%2 == 1)
            System.out.println(i+" ODD NUMBER");
        }
    }
}

class Runnable_even implements Runnable
{
    public void run()
	{
        for(int i=0;i<6;i++)
		{
            if(i%2 == 0)
            System.out.println(i+" EVEN NUMBER");
        }
    }
}